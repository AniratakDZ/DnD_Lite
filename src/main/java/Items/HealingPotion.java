package Items;

public class HealingPotion extends Potion {


    public HealingPotion(){

        setName("Potion of healing");
        setDauer(5);

    }

    public void trankNutzen(){

        System.out.println("Healing Potion heals you by 10 HP");

    }


}
