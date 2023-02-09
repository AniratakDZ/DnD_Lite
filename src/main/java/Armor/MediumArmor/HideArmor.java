package main.Armor.MediumArmor;

import main.Armor.Armor;

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
