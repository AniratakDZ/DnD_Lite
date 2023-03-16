package Items.weapons.miscellaneous;

import Items.IUseItem;
import Items.weapons.Weapons;
import figures.characters.Characters;


public class Quarterstaff extends Weapons implements IUseItem {

    public Quarterstaff(int cost, int damage, int properties, int weight, String name){

        super.setWeapontype(Weapons.Weapontype.STAFF);
        super.setCost(cost);
        super.setDamage(damage);
        super.setProperties(properties);
        super.setWeight(weight);
        super.setName(name);
    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
