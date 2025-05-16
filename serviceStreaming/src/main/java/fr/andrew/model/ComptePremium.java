package fr.andrew.model;

public class ComptePremium extends Compte {
    private double payment;

    public ComptePremium(long id, String nom, double payment) {
        super(id, nom);
        this.payment = payment;
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

    @Override
    public boolean peutAjouterFilm() {
        return true;
    }

    @Override
    public boolean peutRegarder() {
        return true;
    }

    public void stockerPayment(){}
    public int appliquerReduction(){}
    public Famille creerFamille(){}
}
