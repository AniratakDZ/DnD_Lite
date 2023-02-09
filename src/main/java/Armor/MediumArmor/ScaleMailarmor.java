package main.Armor.MediumArmor;

import main.Armor.Armor;

public class ScaleMailarmor extends Armor {

    public ScaleMailarmor() {

        super.setArmortype(Armortype.MEDIUMARMOR);
        super.setCost(50);
        super.setArmorClass(14);
        super.setStrength(0);
        super.setStealthDisadvantage(false);
        super.setWeight(45);

    }

}
