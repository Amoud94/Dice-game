package sample.utilities;

import java.util.Random;

public class randomizer {
    public static int getNumber () {
        Random number = new Random();
        return number.nextInt(6) + 1;
    }
}