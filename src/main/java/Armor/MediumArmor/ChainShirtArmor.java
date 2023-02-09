package main.Armor.MediumArmor;

import main.Armor.Armor;

public class ChainShirtArmor extends Armor {

    public ChainShirtArmor() {

        super.setArmortype(Armortype.MEDIUMARMOR);
        super.setCost(50);
        super.setArmorClass(13);
        super.setStrength(0);
        super.setStealthDisadvantage(true);
        super.setWeight(20);

    }

}
