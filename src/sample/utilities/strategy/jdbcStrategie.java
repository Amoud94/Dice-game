package sample.utilities.strategy;

import sample.entities.*;
import sample.persistence.jdbcKit;
import sample.persistence.persistKit;
import sample.utilities.memento.*;

import java.util.Iterator;
import java.util.Scanner;

public class jdbcStrategie implements strategie {
    originator originator = new originator();
    careTaker careTaker = new careTaker();
    @Override
    public void play(joueur j){
        persistKit p = new jdbcKit();
        entry Entry = new entry();
        Scanner myObj = new Scanner(System.in);
        int score = 0;
        die d1 = new die();
        die d2 = new die();
        dieView v1 = new dieView(d1);
        dieView v2 = new dieView(d2);
        d1.addObserver(v1);
        d2.addObserver(v2);

        for( int i =0; i<10;i++){
            System.out.println("=======================================");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            int cpt = i+1;
            originator.setState("---Lancers numero : "+cpt);
            careTaker.add(originator.saveStateToMemento());
            originator.getStateFromMemento(careTaker.get(i));
            System.out.println(originator.getState());
            System.out.println("------------------------------");
            int dice1FaceValue = (Integer)d1.trow();
            int dice2FaceValue = (Integer)d2.trow();
            System.out.println("------------------------------");
            int total = dice1FaceValue+dice2FaceValue;
            System.out.println("---Total Value : "+total);
            if(total == 7){
                score = score + 10;
                j.setScore(score);
            }
            System.out.println("=======================================");
        }
        System.out.println("final score :"+score);

        Entry.setNom(j.getNom());
        Entry.setScore(j.getScore());

        highScore highScore;
        highScore = p.makeKit();
        highScore.add(Entry);

        highScore.save();
        highScore.load();
        Iterator it = highScore.elements();

        System.out.println("To see your score , enter Yes");
        String viewScore = myObj.nextLine();
        if(viewScore.equalsIgnoreCase("yes")){
            System.out.println("=======================================");
            System.out.println(it.next());
            System.out.println("=======================================");
        }else if(viewScore != "yes"){

        }
        System.out.println("if you wanna play again, enter Yes");
        String playAgain = myObj.nextLine();
        if(playAgain.equalsIgnoreCase("yes")){
            this.play(j);
        }else{
            System.out.println("Thanks for playing !!!!");
        }





//        System.out.println("To see the highest Score , enter HighScore");
//        String viewHighscore = myObj.nextLine();
//        if(viewHighscore.equals("highscore")){
//            System.out.println("=======================================");
//            while (it.hasNext()) {
//                System.out.println(it.next());
//            }
//            System.out.println("=======================================");
//        }


    }
}
