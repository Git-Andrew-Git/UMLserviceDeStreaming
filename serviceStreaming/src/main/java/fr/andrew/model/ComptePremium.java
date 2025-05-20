package fr.andrew.model;

public class ComptePremium extends Compte {
    private double payment=0;


    private final double cout = 10;


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

    public double getCout() {
        return cout;
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
    public String getTypeCompte() {
        return "Premium";
    }

    @Override
    public boolean peutRegarder() {
        return true;
    }

    public void payer() {
        System.out.println(getId() + "compte paye");
        stockerPayment();
    }


    public void stockerPayment(){
        payment += getCout();
    }
    public void appliquerReduction(){}


}
