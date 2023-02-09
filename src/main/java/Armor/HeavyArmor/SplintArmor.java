package Armor.HeavyArmor;

import Armor.Armor;

public class SplintArmor extends Armor {

    public SplintArmor() {

        super.setArmortype(Armortype.HEAVYARMOR);
        super.setCost(200);
        super.setArmorClass(17);
        super.setStrength(15);
        super.setStealthDisadvantage(true);
        super.setWeight(60);

    }

}
