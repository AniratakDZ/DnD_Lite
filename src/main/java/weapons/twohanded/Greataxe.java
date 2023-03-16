package weapons.twohanded;

import Mix.Dice;
import weapons.Weapons;
import weapons.IWeaponBehaviour;


public class Greataxe extends Weapons implements IWeaponBehaviour {

    public Greataxe(){

        super.setWeapontype(Weapons.Weapontype.ONEHANDED_AXE);
        super.setCost(30);
        super.setDamage(Dice.rollDiceInt(1,12));
        super.setWeight(7);
        super.setName("Greataxe");
    }

    @Override
    public void useWeapon() {

    }
}
