package Items.weapons.twohanded;

import Mix.Dice;
import Items.weapons.Weapons;
import figures.characters.Characters;


public class Greatsword extends Weapons {

    public Greatsword(){

        super.setWeapontype(Weapons.Weapontype.ONEHANDED_AXE);
        super.setCost(50);
        super.setDamage(Dice.rollDiceInt(2,6));
        super.setWeight(6);
        super.setName("Greatsword");
    }


    @Override
    public void useArtifact(Characters characters) {

    }
}
