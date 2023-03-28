package Items.weapons.range;

import Items.IUseItem;
import Mix.Dice;
import Items.weapons.Weapons;
import figures.characters.Characters;


public class ShortBow extends Weapons implements IUseItem {

    Weapons shortbow;
    public ShortBow(){
        super.setWeapontype(Weapons.Weapontype.TWOHANDED_RANGE);
        super.setCost(25);
        super.setDamage(Dice.rollDiceInt(1,6));
        super.setWeight(2);
        super.setNormalRange(80);
        super.setLongRange(320);
    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
