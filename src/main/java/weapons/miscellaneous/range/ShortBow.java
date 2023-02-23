package weapons.miscellaneous.range;

import weapons.IWeaponBehaviour;

public class ShortBow implements IWeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("You attacked with your Bow, + 12");
    }
}
