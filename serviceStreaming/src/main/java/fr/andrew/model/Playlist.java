package fr.andrew.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {


    private Compte compte;
    private List<Film> films = new ArrayList<>();
    public Playlist(Compte compte) {
        this.compte = compte;
    }

    public List<Film> getFilms() {

        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
    private boolean verifyPremium(){
        boolean res = false;
        switch (compte){
            case
        }
        return res;
    }
}
