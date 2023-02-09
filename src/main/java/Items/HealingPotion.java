package Items;

import characters.Characters;

public class HealingPotion extends Potion {


    public HealingPotion(){

        setName("Potion of healing");

    }

    @Override
    public void use(Characters characters) {

        trankNutzen(characters);

    }

    public void trankNutzen(Characters character){


        if (character.getLeben() == 20){

            System.out.println("Du kannst dich nicht heilen da dein Charakter volle HP hat!");

        }
        else if(character.getLeben() < 20 && character.getLeben() > 0)
        {

            character.setLeben(character.getLeben() + 10);
            System.out.println("Dein Charakter wurde um 10 HP geheilt!");

        }

    }


}
