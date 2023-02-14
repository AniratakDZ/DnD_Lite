package Die;

import java.util.ArrayList;
import java.util.Random;

public class Dice {

    ArrayList<Integer> numberList = new ArrayList<Integer>();
    Random random = new Random();

    /**
     *
     * @param die // Die type example: d4, d6 etc
     * @return
     */
    int rollOnce(int die) {
        return 1 + random.nextInt(die);
    }

    /**
     *
     * @param die //Die type
     * @param number // Number of times you want to roll the die
     * @return
     */
    ArrayList<Integer>  rollMultipleTimes(int die, int number) {
        for(int x = 0; x < number; x++){
            numberList.add(1 + random.nextInt(die));
        }
        return numberList;
    }

}
