package Weapons.twohanded;

import Mix.Dice;
import Weapons.Weapons;
import weapons.IWeaponBehaviour;


public class Greatsword extends Weapons implements IWeaponBehaviour {

    public Greatsword(){

        super.setWeapontype(Weapons.Weapontype.ONEHANDED_AXE);
        super.setCost(50);
        super.setDamage(Dice.rollDiceInt(2,6));
        super.setWeight(6);
        super.setName("Greatsword");
    }

    @Override
    public void useWeapon() {

    }
}