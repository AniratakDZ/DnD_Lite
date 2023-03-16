package weapons.range;

import Mix.Dice;
import weapons.Weapons;
import weapons.IWeaponBehaviour;


public class CrowsbowLight extends Weapons implements IWeaponBehaviour {

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
    public void useWeapon() {
        System.out.println("You attacked with your Bow, + 12");
    }
}
