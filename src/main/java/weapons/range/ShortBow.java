package weapons.range;

import Mix.Dice;
import weapons.Weapons;
import weapons.IWeaponBehaviour;


public class ShortBow extends Weapons implements IWeaponBehaviour {

    IWeaponBehaviour shortbow;
    public ShortBow(){
        super.setWeapontype(Weapons.Weapontype.TWOHANDED_RANGE);
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
