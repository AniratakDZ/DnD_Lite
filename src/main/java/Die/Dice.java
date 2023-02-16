package Die;

import java.util.ArrayList;
import java.util.Random;

public class Dice {

    static ArrayList<Integer> numberList = new ArrayList<>();
    static Random random = new Random();

    /**
     * @param die // Die type example: d4, d6 etc
     * @return Returns the rolled value as an Integer
     */
    public static int rollOnce(int die) {
        return 1 + random.nextInt(die);
    }

    /**
     * @param die    //Die type
     * @param number // Number of times you want to roll the die
     * @return Returns an Integer Arraylist with all values that have been rolled
     */
    public static ArrayList<Integer> rollMultipleTimes(int die, int number) {

        for (int x = 0; x < number; x++) {
            numberList.add(1 + random.nextInt(die));
        }
        return numberList;
    }

    /**
     *
     * @param die    //Die type
     * @param number // Number of times you want to roll the die
     * @return Returns an int value, that represents the sum of all rolls
     */
    public static int rollMultipleTimesMultiply(int die, int number) {

        int value = 0;

        for (int x = 0; x < number; x++) {
            value += random.nextInt(die);
        }
        return value;
    }
}
