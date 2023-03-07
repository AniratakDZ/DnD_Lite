package Armor.LightArmor;

import Armor.Armor;

public class LeatherArmor extends Armor {

    public LeatherArmor() {

        super.setArmortype(Armortype.LIGHTARMOR);
        super.setCost(10);
        super.setArmorClass(11);
        super.setStrength(0);
        super.setStealthDisadvantage(false);
        super.setWeight(10);

    }
}
