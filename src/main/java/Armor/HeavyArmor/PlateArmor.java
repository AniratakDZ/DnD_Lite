package Armor.HeavyArmor;

import Armor.Armor;

public class PlateArmor extends Armor {

    public PlateArmor() {

        super.setArmortype(Armortype.HEAVYARMOR);
        super.setCost(1500);
        super.setArmorClass(18);
        super.setStrength(15);
        super.setStealthDisadvantage(true);
        super.setWeight(65);

    }

}
