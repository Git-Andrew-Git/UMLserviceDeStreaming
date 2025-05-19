package fr.andrew;

import fr.andrew.model.ComptePremium;
import fr.andrew.model.Famille;

public class Main {
    public static void main(String[] args) {
        Famille famille1 = new Famille(1);
        Famille famille2 = new Famille(2);
        Famille famille3 = new Famille(3);
        Famille famille4 = new Famille(4);
        Famille famille5 = new Famille(5);

        ComptePremium comptePremium1 = new ComptePremium(1, "Bob");
        ComptePremium comptePremium2 = new ComptePremium(2, "Ann");
        ComptePremium comptePremium3 = new ComptePremium(3, "Jack");
        ComptePremium comptePremium4 = new ComptePremium(4, "Andrew");
        ComptePremium comptePremium5 = new ComptePremium(5, "Susy");

        famille1.ajouterComptePremium(comptePremium1);
        famille1.ajouterComptePremium(comptePremium2);
        famille1.ajouterComptePremium(comptePremium3);
        famille1.ajouterComptePremium(comptePremium4);

    }
}