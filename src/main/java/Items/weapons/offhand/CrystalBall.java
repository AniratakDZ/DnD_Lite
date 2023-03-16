package Items.weapons.offhand;

import Items.IUseItem;
import Items.weapons.Weapons;
import figures.characters.Characters;


public class CrystalBall extends Weapons implements IUseItem {

    public CrystalBall(int cost, int damage, int properties, int weight, String name) {

        super.setWeapontype(Weapons.Weapontype.OFFHAND);
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
