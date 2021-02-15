package Game;

import java.util.Random;

public class Dice {
    private int diceNumber;

    public Dice() {
        diceNumber = new Random().nextInt(6) + 1;
    }

    public int getDiceNumber(){
        return diceNumber;
    }
}
