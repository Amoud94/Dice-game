package sample.entities;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class joueurView extends Component implements Observer {
    joueur j = new joueur();

    public joueurView(joueur j1) {
        this.j = j1;
    }

    @Override
    public void update(Observable o, Object arg) {
        joueur j = (joueur) o ;
        System.out.println(j.toString());
    }
}
