package sample.persistence;

import sample.entities.highScore;
import sample.persistence.dbMetier.dbInteraction;

public class jdbcKit  implements persistKit {
    @Override
    public highScore makeKit() {
        return new jdbcFactory();
    }

}
