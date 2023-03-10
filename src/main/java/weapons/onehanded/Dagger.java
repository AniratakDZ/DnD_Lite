package Weapons.onehanded;

import Mix.Dice;
import Weapons.Weapons;
import weapons.IWeaponBehaviour;


public class Dagger extends Weapons implements IWeaponBehaviour {

    public Dagger(){

        super.setWeapontype(Weapons.Weapontype.ONEHANDED_AXE);
        super.setCost(2);
        super.setDamage(Dice.rollDiceInt(1,4));
        super.setWeight(1);
        super.setName("Dagger");
    }

    @Override
    public void useWeapon() {
        System.out.println("You attacked with your Knife, + 7");
    }

}
