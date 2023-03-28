package Items.weapons.onehanded;

import Items.IUseItem;
import Mix.Dice;
import Items.weapons.Weapons;
import figures.characters.Characters;


public class Dagger extends Weapons implements IUseItem {

    public Dagger(){

        super.setWeapontype(Weapons.Weapontype.ONEHANDED_AXE);
        super.setCost(2);
        super.setDamage(Dice.rollDiceInt(1,4));
        super.setWeight(1);
        super.setName("Dagger");
    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
