package fr.andrew.model;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CompteDecouverte extends Compte {
    private int count = 1;


    public CompteDecouverte(long id, String nom) {
        super(id, nom);

    }

    @Override
    public String toString() {
        return "CompteDecouverte{}";
    }

    private void timeOut() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable task = new Runnable(){
            @Override
            public void run() {
                setCount(1);

            }
        };
        scheduler.schedule(task, 1, TimeUnit.DAYS );
        scheduler.shutdown();
    }


    @Override
    public void regarderFilm(Film film) {
        if (peutRegarder(film)) {
            System.out.println(film + " est regardé");
            getPlaylist().suprimerFilm(film);
            setCount(-1);
            timeOut();

        } else {
            System.out.println("on peut pas regarder film");
        }
    }
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }

    @Override
    protected boolean peutAjouterFilm() {
        boolean result = false;
        if (getPlaylist().getFilms().isEmpty()) {
            result = true;
        }
        return result;
    }



    @Override
    protected boolean peutRegarder(Film film) {
        boolean result = false;
        if (!getPlaylist().getFilms().isEmpty()) {
            if (getCount() < 1) {
                System.out.println("you can only watch a film once per day");
                return result;
            }
            if (getPlaylist().verifyFilm(film)) {
                result = true;

            } else {
                System.out.println("There is no such film in your playlist");
            }
        } else
            System.out.println("there is nothing to watch");
        return result;
    }
}
