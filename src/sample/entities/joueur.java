package sample.entities;

import java.util.Observable;

public class joueur extends Observable {

    private String nom;
    private int score;

    public joueur() {

    }

    public joueur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
        setChanged();
        notifyObservers(nom);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        setChanged();
        notifyObservers(score);
    }

    @Override
    public String toString() {
        return "joueur { " +
                "nom = " + nom +
                " || score = " + score +
                " }";
    }

    public void play(String nom,int score){
          this.setNom(nom);
          this.setScore(score);
    }
    public void show(){
        this.toString();
    }
}
