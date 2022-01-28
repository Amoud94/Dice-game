package sample.entities;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class dieView extends Component implements Observer {
    die dice = new die();

    public dieView(die dice) {
        this.dice = dice;
    }

    public die getDice() {
        return dice;
    }

    public void setDice(die dice) {
        this.dice = dice;
    }

    @Override
    public void update(Observable o, Object arg) {
        die die = (die) o;
        System.out.println(die.toString());
    }
}
