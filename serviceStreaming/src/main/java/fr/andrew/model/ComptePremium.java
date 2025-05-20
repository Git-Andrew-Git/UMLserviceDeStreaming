package fr.andrew.model;

public class ComptePremium extends Compte {
    private double payment=0;
    private double cout = 10;
    private double reduction = -3;
    private long idFamille=-1;




    private Famille famille;

    public ComptePremium(long id, String nom) {
        super(id, nom);
    }

    @Override
    public String toString() {
        return "ComptePremium{" +
                "payment=" + payment +
                '}';
    }

    @Override
    public void regarderFilm(Film film) {
        if (peutRegarder(film)) {
            System.out.println(film + " est regardé");
            getPlaylist().suprimerFilm(film);
        } else {
            System.out.println("on peut pas regarder film");
        }
    }





    public Famille getFamille() {
        return famille;
    }

    public void setFamille(Famille famille) {
        this.famille = famille;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }

    public void setReduction(double reduction) {
        this.reduction = reduction;
    }

    public double getReduction() {
        return reduction;
    }
    public double getCout() {
        return cout;
    }
    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment += payment;
    }

    public long getIdFamille() {
        return idFamille;
    }

    public void setIdFamille(long famille) {
        this.idFamille = famille;
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
    public boolean peutRegarder(Film film) {
        boolean result = false;
        if (!getPlaylist().getFilms().isEmpty()) {
            if (getPlaylist().verifyFilm(film)) {
                result = true;
            } else {
                System.out.println("There is no such film in your playlist");
            }

        } else {
            System.out.println("there is nothing to watch");
        }
        return result;
    }

    public void payer() {
        stockerPayment();
        System.out.println(getId() + "compte payé : " + getCout());
    }


    public void stockerPayment(){
        if (getIdFamille() > 0) {
            appliquerReduction();
            setPayment(getCout());
            System.out.println("totale payé : " + getPayment());


        } else {

        setPayment(getCout());
        System.out.println("totale payé : " + getPayment());
        }
    }
    private void appliquerReduction(){
        if (getFamille().getComptesPremiums().size() >= 2) {
        setCout(getCout() + getReduction());

        }
    }
}
