package fr.andrew;

import fr.andrew.model.CompteDecouverte;
import fr.andrew.model.ComptePremium;
import fr.andrew.model.Famille;
import fr.andrew.model.Film;

import java.util.ArrayList;
import java.util.Arrays;

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

        CompteDecouverte compteDecouverte1 = new CompteDecouverte(1, "Luke");
        CompteDecouverte compteDecouverte2 = new CompteDecouverte(2, "Philippe");

        famille1.ajouterComptePremium(comptePremium1);
        famille1.ajouterComptePremium(comptePremium2);
        famille1.ajouterComptePremium(comptePremium3);


        famille2.ajouterComptePremium(comptePremium5);

//        comptePremium1.payer();
//        comptePremium4.payer();
//        comptePremium5.payer();

        Film film1 = new Film("Matrix", new ArrayList<>(Arrays.asList("Keanu", "Lorence")));
        Film film2 = new Film("Titanic", new ArrayList<>(Arrays.asList("Leonardo")));
        Film film3 = new Film("Dark Knight", new ArrayList<>(Arrays.asList("Oldman", "Ledger", "Christian")));

//        comptePremium1.getPlaylist().ajouterFilm(film2);
//        comptePremium1.getPlaylist().ajouterFilm(film1);
//        comptePremium1.getPlaylist().ajouterFilm(film3);
//
//        comptePremium1.regarderFilm(film1);
//        System.out.println(comptePremium1.getPlaylist());
//        comptePremium1.regarderFilm(film3);
//        System.out.println(comptePremium1.getPlaylist());
//        comptePremium1.regarderFilm(film3);
//        System.out.println(comptePremium1.getPlaylist());



//        compteDecouverte1.regarderFilm(film1);
//        compteDecouverte1.getPlaylist().ajouterFilm(film2);
//        compteDecouverte1.getPlaylist().ajouterFilm(film1);
//
//        compteDecouverte1.regarderFilm(film1);
//        compteDecouverte1.regarderFilm(film2);

    }
}