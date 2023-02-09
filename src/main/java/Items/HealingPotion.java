package Items;

import characters.Characters;

public class HealingPotion extends Potion {


    public HealingPotion() {

        setName("Potion of healing");

    }

    public void useArtifact(Characters character) {

        if (character.getCurrentLife() == 20) {

            System.out.println("Du kannst dich nicht heilen da dein Charakter volle HP hat!");

        } else if (character.getCurrentLife() < 20 && character.getCurrentLife() > 0) {

            if (character.getCurrentLife() + 10 > character.getMaxLife()) {

                character.setCurrentLife(character.getMaxLife());
            } else {

                character.setCurrentLife(character.getCurrentLife() + 10);
                System.out.println("Dein Charakter wurde um 10 HP geheilt!");
            }
        }

    }


}
