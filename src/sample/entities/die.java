package sample.entities;

import sample.utilities.randomizer;

import java.awt.*;
import java.util.*;

public class die extends Observable {

    private int faceValue;

    public die() {

    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
        setChanged();
        notifyObservers();
    }

    public int trow(){
//        dieView v1 = new dieView(this);
//        this.addObserver(v1);
        this.setFaceValue(randomizer.getNumber());
        return getFaceValue();
    }

    @Override
    public String toString() {
        return "die { " +
                "faceValue = " + faceValue +
                " }";
    }
    //    public java.awt.Component show(){
//        Component c = new dieView(this);
//        this.addObserver((Observer)c);
//        return c;
//    }

}
