package org.example;

import org.example.Joueur;
import org.example.Score;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Nombre de joueurs: ");
        int nombreJoueurs = scan.nextInt();

        List <Joueur>joueurs = new ArrayList();

        for(int i=0; i<nombreJoueurs; i++){
            Joueur nouveauJoueur = new Joueur(new Score(0));
            joueurs.add(nouveauJoueur);
            nouveauJoueur.setNom();
        }

        for (Joueur joueur : joueurs) {
            System.out.print(joueur.getNom() + " ");
            while (joueur.getScore()<=10)
                joueur.play();
        }
    }
}