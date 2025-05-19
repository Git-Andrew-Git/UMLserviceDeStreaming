package fr.andrew.model;

import java.util.ArrayList;
import java.util.List;

public class Famille {
    private long id;
    private final int reduction = 10;


    private List<ComptePremium> comptesPremiums = new ArrayList<>();

    public Famille(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Famille{" +
                "id=" + id +
                ", reduction=" + reduction +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getReduction() {
        return reduction;
    }
    public List<ComptePremium> getComptesPremiums() {
        return comptesPremiums;
    }

    public void ajouterComptePremium(ComptePremium comptePremium) {
        if (comptePremium.getFamille()>0){
            System.out.println("Il a une famille, impossible d'avoir plus qu'une famille");
            return;
        }
        this.getComptesPremiums().add(comptePremium);
        comptePremium.setFamille(getId());
    }

}
