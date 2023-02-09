package main.weapons.twohanded;

import main.weapons.IWeaponBehaviour;
import main.weapons.Weapons;

public class TwohandedAxe extends Weapons implements IWeaponBehaviour {

    public TwohandedAxe(int cost, int damage, int properties, int weight, String name){

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
