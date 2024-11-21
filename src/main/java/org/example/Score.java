package org.example;

import org.example.Joueur;

public class Score {

    private Joueur joueur;
    private int score;

    public Score(int score) {
        this.score = score;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public int  caluclateScore(){
        return score += joueur.getDes();
    }

}
