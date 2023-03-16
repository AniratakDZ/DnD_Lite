package Items.weapons.onehanded;

import Items.IUseItem;
import Mix.Dice;
import Items.weapons.Weapons;
import figures.characters.Characters;


public class ShortSword extends Weapons implements IUseItem {

    public ShortSword(){

        super.setWeapontype(Weapons.Weapontype.ONEHANDED_AXE);
        super.setCost(19);
        super.setDamage(Dice.rollDiceInt(1,6));
        super.setWeight(2);
        super.setName("Shortsword");
    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
