package weapons.onehanded;

import Mix.Dice;
import weapons.IWeaponBehaviour;
import weapons.Weapons;

public class ShortSword extends Weapons implements IWeaponBehaviour {

    public ShortSword(int cost, int damage, int properties, int weight, String name){

        super.setWeapontype(Weapontype.ONEHANDED_AXE);
        super.setCost(19);
        super.setDamage(Dice.rollOnce(6));
        super.setWeight(2);
        super.setName("Shortsword");
    }

    @Override
    public void useWeapon() {
        System.out.println("You attacked with your Sword, + 8");
    }
}
