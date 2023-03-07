package Mix;

import java.util.ArrayList;
import java.util.Random;

public class Dice {

    static ArrayList<Integer> numberList = new ArrayList<>();
    static Random random = new Random();

    /**
     * @param die    //Die type
     * @param number // Number of times you want to roll the die
     * @return Returns an int value, that represents the sum of all rolls
     */
    public static int rollDiceInt(int number, int die) {

        int value = 0;

        for (int x = 0; x < number; x++) {
            value += random.nextInt(die);
        }
        return value;
    }

    /**
     * @param die    //Die type
     * @param number // Number of times you want to roll the die
     * @return Returns an int Array, that represents the sum of all rolls
     */
    public static int[] rollDiceArray(int number, int die) {

        int[] rolls = new int[die];

        for (int x = 0; x < number; x++) {
            rolls[x] += random.nextInt(die);
        }
        return rolls;
    }
}
