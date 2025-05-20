package fr.andrew.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {


    private final Compte compte;
    private List<Film> films = new ArrayList<>();
    public Playlist(Compte compte) {
        this.compte = compte;
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

    private boolean verifyPremium(){
        boolean res = false;
        if (compte instanceof ComptePremium){
            res = true;
        }
        return res;
    }

    public void ajouterFilm(Film films){
        if (verifyPremium()){
            setFilms(films);
        } else {
            if (this.films.size()>1){
                System.out.println("Not premium, only one film can be added");
            } else {
                setFilms(films);
            }
        }
    }
}
