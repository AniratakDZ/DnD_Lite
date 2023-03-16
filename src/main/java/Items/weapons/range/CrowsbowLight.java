package Items.weapons.range;

import Items.IUseItem;
import Mix.Dice;
import Items.weapons.Weapons;
import figures.characters.Characters;


public class CrowsbowLight extends Weapons implements IUseItem {

    public CrowsbowLight(){

        super.setWeapontype(Weapons.Weapontype.TWOHANDED_RANGE);
        super.setCost(25);
        super.setDamage(Dice.rollDiceInt(1,8));
        super.setWeight(5);
        super.setName("CrowsbowLight");
        super.setNormalRange(80);
        super.setLongRange(320);
    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
