package fr.andrew.model;

import java.util.List;

public class Film {
    private String nom;
    private List<String> acteurs;

    public Film(String nom, List<String> acteurs) {
        this.nom = nom;
        this.acteurs = acteurs;
    }

    @Override
    public String toString() {
        return "Film{" +
                "nom='" + nom + '\'' +
                ", acteurs=" + acteurs +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<String> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<String> acteurs) {
        this.acteurs = acteurs;
    }
}
