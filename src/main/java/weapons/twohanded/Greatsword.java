package weapons.twohanded;

import Mix.Dice;
import weapons.IWeaponBehaviour;
import weapons.Weapons;

public class Greatsword extends Weapons implements IWeaponBehaviour {

    public Greatsword(){

        super.setWeapontype(Weapontype.ONEHANDED_AXE);
        super.setCost(50);
        super.setDamage(Dice.rollMultipleTimesMultiply(6,2));
        super.setWeight(6);
        super.setName("Greatsword");
    }

    @Override
    public void useWeapon() {

    }
}
