package main.weapons;

public class BowAndArrow implements IWeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("You attacked with your Bow, + 12");
    }
}
