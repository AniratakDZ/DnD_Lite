package Armor.LightArmor;

import Armor.Armor;

public class PaddedArmor extends Armor {

    public PaddedArmor() {

        super.setArmortype(Armortype.LIGHTARMOR);
        super.setCost(5);
        super.setArmorClass(11);
        super.setStrength(0);
        super.setStealthDisadvantage(true);
        super.setWeight(8);

    }

}
