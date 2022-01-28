package sample.entities;

public abstract class diceGame {

    private static diceGame single_instance = null;

    public static diceGame getInstance()
    {
        if (single_instance == null)
            single_instance = new diceGame(){

                @Override
                public void play() {

                }
            };

        return single_instance;
    }

    public abstract void play() throws Exception;
}
