package main.weapons.miscellaneous;

import main.weapons.IWeaponBehaviour;
import main.weapons.Weapons;

public class Quarterstaff extends Weapons implements IWeaponBehaviour {

    public Quarterstaff(int cost, int damage, int properties, int weight, String name){

        super.setWeapontype(Weapontype.onehandedAxe);
        super.setCost(cost);
        super.setDamage(damage);
        super.setProperties(properties);
        super.setWeight(weight);
        super.setName(name);
    }

    @Override
    public void useWeapon() {

    }
}
