package main.weapons.onehanded;

import main.weapons.IWeaponBehaviour;
import main.weapons.Weapons;

public class OnehandedSword extends Weapons implements IWeaponBehaviour {

    public OnehandedSword(int cost, int damage, int properties, int weight, String name){

        super.setWeapontype(Weapontype.onehandedAxe);
        super.setCost(cost);
        super.setDamage(damage);
        super.setProperties(properties);
        super.setWeight(weight);
        super.setName(name);
    }

    @Override
    public void useWeapon() {
        System.out.println("You attacked with your Sword, + 8");
    }
}
