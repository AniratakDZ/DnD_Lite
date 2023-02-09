package Armor.MediumArmor;

import Armor.Armor;

public class BreastplateArmor extends Armor {

    public BreastplateArmor() {

        super.setArmortype(Armortype.MEDIUMARMOR);
        super.setCost(400);
        super.setArmorClass(14);
        super.setStrength(0);
        super.setStealthDisadvantage(false);
        super.setWeight(20);

    }

}
