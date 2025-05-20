package fr.andrew.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {


    private final Compte compte;
    private List<Film> films = new ArrayList<>();
    public Playlist(Compte compte) {
        this.compte = compte;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "compte=" + compte +
                ", films=" + films +
                '}';
    }

    public List<Film> getFilms() {

        return films;
    }

    public void setFilms(Film films) {
        this.films.add(films);
    }

    public Compte getCompte() {
        return compte;
    }

    protected boolean verifyFilm(Film film) {
        return getFilms().contains(film);
    }

    private boolean verifyPremium(){
        boolean res = false;
        if (getCompte() instanceof ComptePremium){
            res = true;
        }
        return res;
    }

    public void ajouterFilm(Film films){
        if (verifyPremium()){
            setFilms(films);
            System.out.println(films + " est ajouté");
        } else {
            if (!getCompte().peutAjouterFilm()){
                System.out.println("Not premium, only one film can be added");
            } else {
                setFilms(films);
                System.out.println(films + " est ajouté");
            }
        }
    }

    public void suprimerFilm(Film film) {
        if (getFilms().isEmpty()) {
            System.out.println("there is no films");
        } else {
            getFilms().remove(film);
            System.out.println(film + " est suprimé");
        }
    }
}
