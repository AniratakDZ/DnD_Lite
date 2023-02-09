package main.Armor.LightArmor;

import main.Armor.Armor;

public class StuddedLeatherArmor extends Armor {

    public StuddedLeatherArmor() {

        super.setArmortype(Armortype.LIGHTARMOR);
        super.setCost(45);
        super.setArmorClass(12);
        super.setStrength(0);
        super.setStealthDisadvantage(false);
        super.setWeight(10);

    }

}
