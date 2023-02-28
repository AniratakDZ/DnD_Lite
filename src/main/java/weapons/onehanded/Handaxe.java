package weapons.onehanded;

import Mix.Dice;
import weapons.IWeaponBehaviour;
import weapons.Weapons;

public class Handaxe extends Weapons implements IWeaponBehaviour {

    public Handaxe(){

        super.setWeapontype(Weapontype.ONEHANDED_AXE);
        super.setCost(5);
        super.setDamage(Dice.rollOnce(6));
        super.setWeight(2);
        super.setName("Handaxe");
    }

    @Override
    public void useWeapon() {
        System.out.println("You attacked with your Axe, + 10");
    }
}
