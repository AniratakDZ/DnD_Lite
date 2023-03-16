package weapons.miscellaneous;

import weapons.Weapons;
import weapons.IWeaponBehaviour;


public class Quarterstaff extends Weapons implements IWeaponBehaviour {

    public Quarterstaff(int cost, int damage, int properties, int weight, String name){

        super.setWeapontype(Weapons.Weapontype.STAFF);
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
