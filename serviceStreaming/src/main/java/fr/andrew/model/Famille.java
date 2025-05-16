package fr.andrew.model;

public class Famille {
    private long id;
    private final int reduction = 10;

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

    public void ajouterCompte(){}
}
