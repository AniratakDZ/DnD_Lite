package Armor.MediumArmor;

import Armor.Armor;

public class HalfPlate extends Armor {

    public HalfPlate() {

        super.setArmortype(Armortype.MEDIUMARMOR);
        super.setCost(750);
        super.setArmorClass(15);
        super.setStrength(0);
        super.setStealthDisadvantage(true);
        super.setWeight(40);

    }

}
