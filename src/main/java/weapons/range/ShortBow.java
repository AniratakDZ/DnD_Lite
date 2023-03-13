package weapons.range;

import Mix.Dice;
import weapons.IWeaponBehaviour;
import weapons.Weapons;

public class ShortBow extends Weapons implements IWeaponBehaviour {

    IWeaponBehaviour shortbow;
    public ShortBow(){
        super.setWeapontype(Weapontype.TWOHANDED_RANGE);
        super.setCost(25);
        super.setDamage(Dice.rollDiceInt(1,6));
        super.setWeight(2);
        super.setNormalRange(80);
        super.setLongRange(320);
    }
    @Override
    public void useWeapon() {
        System.out.println("You attacked with your Bow, + 12");
    }
}
