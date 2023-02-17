package weapons.offhand;

import weapons.IWeaponBehaviour;
import weapons.Weapons;

public class CrystalBall extends Weapons implements IWeaponBehaviour {

    public CrystalBall(int cost, int damage, int properties, int weight, String name) {

        super.setWeapontype(Weapontype.offhand);
        super.setCost(cost);
        super.setDamage(damage);
        super.setProperties(properties);
        super.setWeight(weight);
        super.setName(name);
    }

    @Override
    public void useWeapon() {
        System.out.println("Kristallkugel macht Kristallkugelsachen");
    }
}
