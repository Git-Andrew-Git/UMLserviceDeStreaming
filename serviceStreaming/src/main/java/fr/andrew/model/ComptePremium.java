package fr.andrew.model;

public class ComptePremium extends Compte {
    private double payment;


    private long famille=-1;

    public ComptePremium(long id, String nom) {
        super(id, nom);
    }

    @Override
    public String toString() {
        return "ComptePremium{" +
                "payment=" + payment +
                '}';
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public long getFamille() {
        return famille;
    }

    public void setFamille(long famille) {
        this.famille = famille;
    }
    @Override
    public boolean peutAjouterFilm() {
        return true;
    }

    @Override
    public boolean peutRegarder() {
        return true;
    }

    public void stockerPayment(){}
    public void appliquerReduction(){}


}
