package Weapons.onehanded;

import Mix.Dice;
import Weapons.Weapons;
import weapons.IWeaponBehaviour;


public class ShortSword extends Weapons implements IWeaponBehaviour {

    public ShortSword(){

        super.setWeapontype(Weapons.Weapontype.ONEHANDED_AXE);
        super.setCost(19);
        super.setDamage(Dice.rollDiceInt(1,6));
        super.setWeight(2);
        super.setName("Shortsword");
    }

    @Override
    public void useWeapon() {
        System.out.println("You attacked with your Sword, + 8");
    }
}
