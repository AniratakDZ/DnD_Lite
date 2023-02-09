package weapons.onehanded;

import weapons.IWeaponBehaviour;
import weapons.Weapons;

public class Dagger extends Weapons implements IWeaponBehaviour {

    public Dagger(int cost, int damage, int properties, int weight, String name){

        super.setWeapontype(Weapontype.onehandedAxe);
        super.setCost(cost);
        super.setDamage(damage);
        super.setProperties(properties);
        super.setWeight(weight);
        super.setName(name);
    }

    @Override
    public void useWeapon() {
        System.out.println("You attacked with your Knife, + 7");
    }

    public void strike() {
        System.out.println("Stab the target!");
    }
}
