package sample.persistence;

import sample.entities.highScore;

public class xmlKit  implements persistKit{
    @Override
    public highScore makeKit() {
        System.out.println("Inside xml");
        return new xmlFactory();
    }
}
