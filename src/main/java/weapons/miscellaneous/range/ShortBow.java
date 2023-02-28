package weapons.miscellaneous.range;

import Mix.Dice;
import weapons.IWeaponBehaviour;
import weapons.Weapons;

public class ShortBow extends Weapons implements IWeaponBehaviour {

    IWeaponBehaviour shortbow;
    public ShortBow(){
        super.setWeapontype(Weapontype.TWOHANDED_RANGE);
        super.setCost(25);
        super.setDamage(Dice.rollOnce(6));
        super.setWeight(2);
    }
    @Override
    public void useWeapon() {
        System.out.println("You attacked with your Bow, + 12");
    }
}
