package main.Armor.HeavyArmor;

import main.Armor.Armor;

public class ChainMail extends Armor {



    public ChainMail() {

        super.setArmortype(Armortype.HEAVYARMOR);
        super.setCost(75);
        super.setArmorClass(16);
        super.setStrength(13);
        super.setStealthDisadvantage(true);
        super.setWeight(55);

    }

}
