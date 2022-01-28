package sample.utilities.strategy;

import sample.entities.*;
import sample.persistence.jdbcKit;
import sample.persistence.persistKit;
import sample.persistence.xmlKit;
import sample.utilities.memento.careTaker;
import sample.utilities.memento.originator;
import sample.utilities.strategy.strategie;

import java.io.IOException;
import java.util.Iterator;

public class xmlStrategie implements strategie {
    originator originator = new originator();
    careTaker careTaker = new careTaker();
    @Override
    public void play(joueur j) throws Exception {
//        p = new xmlKit();
//        entry Entry = new entry();
//        int score = 0;
//        die d1 = new die();
//        die d2 = new die();
//        dieView v1 = new dieView(d1);
//        dieView v2 = new dieView(d2);
//        d1.addObserver(v1);
//        d2.addObserver(v2);
//
//        for( int i =0; i<10;i++){
//            try {
//                Thread.sleep(800);
//            } catch (InterruptedException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//            originator.setState("lancers numero "+i+" .");
//            careTaker.add(originator.saveStateToMemento());
//            int dice1FaceValue = (Integer)d1.trow();
//            System.out.println("value dice 1 :" + dice1FaceValue);
//            int dice2FaceValue = (Integer)d2.trow();
//            System.out.println("value dice 2 :" + dice2FaceValue);
//            int total = dice1FaceValue+dice2FaceValue;
//            System.out.println("--------"+total+"----------");
//            if(total == 7){
//                score = score + 10;
//            }
//
//        }
//        System.out.println("final :"+score);
//
//        originator.getStateFromMemento(careTaker.get(0));
//        System.out.println("First saved State: " + originator.getState());
//
//        Entry.setNom(j.getNom());
//        Entry.setScore(score);
//
//        highScore highScore;
//        highScore = p.makeKit();
//        highScore.add(Entry);
//
//            highScore.save();
//            highScore.load();
//
//        Iterator it = highScore.elements();
//        while (it.hasNext())
//            System.out.println(it.next());
//        highScore.elements().next();
    }
}
