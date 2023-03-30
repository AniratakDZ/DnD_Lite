package Items.weapons.twohanded;

import Mix.Dice;
import Items.weapons.Weapons;
import figures.characters.Characters;


public class Greataxe extends Weapons {

    public Greataxe(){

        super.setWeapontype(Weapons.Weapontype.ONEHANDED_AXE);
        super.setCost(30);
        super.setDamage(Dice.rollDiceInt(1,12));
        super.setWeight(7);
        super.setName("Greataxe");
    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
