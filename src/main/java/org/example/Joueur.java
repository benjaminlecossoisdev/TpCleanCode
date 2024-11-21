package org.example;

import java.util.Scanner;

public class Joueur {

    private String nom;
    private int des;
    private Score score;

    Scanner scan= new Scanner(System.in);

    public Joueur(Score score) {
        this.score = score;
        score.setJoueur(this);
    }

    public int getScore() {
        return score.caluclateScore();
    }

    public int getDes() {
        return des;
    }

    public void lancerDes() {
        this.des = (int) (Math.random() * 6)+1;
    }

    public String getNom() {
        return nom;
    }

    public void setNom() {
        System.out.print("Nom joueur : ");
        this.nom = scan.next();;
    }

    public void play() {
        lancerDes();
        System.out.println("Résultat du lancer de dés: " + des);
        System.out.println("Score " + nom + " : " + score.caluclateScore());
    }
}
