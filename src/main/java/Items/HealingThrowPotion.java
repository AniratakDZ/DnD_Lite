package Items;

import figures.characters.Characters;

public class HealingThrowPotion extends ThrowPotion {



    public HealingThrowPotion(){

        setName("Wurftrank der Heilung");

    }

    @Override
    public void useArtifact(Characters character) {

        if (character.getCurrentLife() == 20) {

            System.out.println("Du kannst dich nicht heilen da dein Charakter volle HP hat!");

        } else if (character.getCurrentLife() < 20 && character.getCurrentLife() > 0) {

            if (character.getCurrentLife() + 5 > character.getMaxLife()) {

                character.setCurrentLife(character.getMaxLife());
            } else {

                character.setCurrentLife(character.getCurrentLife() + 5);
                System.out.println("Dein Charakter wurde um 10 HP geheilt!");
            }
        }

    }
}
