package fr.andrew.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Compte {
    private long id;
    private String nom;
    private final Playlist playlist = new Playlist(this);

    public Compte(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract boolean peutRegarder();
    public abstract boolean peutAjouterFilm();
    public abstract String getTypeCompte();
}
