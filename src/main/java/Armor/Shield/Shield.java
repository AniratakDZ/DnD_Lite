package Armor.Shield;

import Armor.Armor;

public class Shield extends Armor {

    public Shield() {

        super.setArmortype(Armortype.SHIELD);
        super.setCost(10);
        super.setArmorClass(2);
        super.setStrength(0);
        super.setStealthDisadvantage(false);
        super.setWeight(6);

    }

}
