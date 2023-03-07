package Armor.MediumArmor;

import Armor.Armor;

public class HideArmor extends Armor {

    public HideArmor() {

        super.setArmortype(Armortype.MEDIUMARMOR);
        super.setCost(10);
        super.setArmorClass(12);
        super.setStrength(0);
        super.setStealthDisadvantage(false);
        super.setWeight(12);

    }

}
