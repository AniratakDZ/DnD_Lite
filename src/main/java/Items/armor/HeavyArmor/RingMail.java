package Items.armor.HeavyArmor;

import Items.IUseItem;
import Items.armor.Armor;
import figures.characters.Characters;

public class RingMail extends Armor implements IUseItem {

    public RingMail() {

        super.setArmortype(Armortype.HEAVYARMOR);
        super.setCost(30);
        super.setArmorClass(14);
        super.setStrength(0);
        super.setStealthDisadvantage(true);
        super.setWeight(40);
        super.setName("Ring Mail");
    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
