package fr.andrew.model;

public class CompteDecouverte extends Compte {
    public CompteDecouverte(long id, String nom) {
        super(id, nom);
    }

    @Override
    public String toString() {
        return "CompteDecouverte{}";
    }

    @Override
    public boolean peutAjouterFilm() {
        return false;
    }

    @Override
    public boolean peutRegarder() {
        return false;
    }
}
