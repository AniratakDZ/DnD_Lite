package Items.armor.HeavyArmor;

import Items.IUseItem;
import Items.armor.Armor;
import figures.characters.Characters;

public class ChainMail extends Armor implements IUseItem {

    public ChainMail() {

        super.setArmortype(Armortype.HEAVYARMOR);
        super.setCost(75);
        super.setArmorClass(16);
        super.setStrength(13);
        super.setStealthDisadvantage(true);
        super.setWeight(55);
        super.setName("Chain Mail");

    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
