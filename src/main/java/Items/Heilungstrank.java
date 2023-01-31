package Items;

public class Heilungstrank extends Trank{


    public Heilungstrank(){

        setName("Trank der Heilung");

    }

    public void trankNutzen(){

        System.out.println("Heiltrank heilt dich um 20 HP!");

    }


}
