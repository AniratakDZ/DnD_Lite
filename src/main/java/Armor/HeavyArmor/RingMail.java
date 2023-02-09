package main.Armor.HeavyArmor;

import main.Armor.Armor;

public class RingMail extends Armor {

    public RingMail() {

        super.setArmortype(Armortype.HEAVYARMOR);
        super.setCost(30);
        super.setArmorClass(14);
        super.setStrength(0);
        super.setStealthDisadvantage(true);
        super.setWeight(40);

    }

}
