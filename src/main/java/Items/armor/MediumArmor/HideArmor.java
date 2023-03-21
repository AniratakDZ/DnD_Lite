package Items.armor.MediumArmor;

import Items.IUseItem;
import Items.armor.Armor;
import figures.characters.Characters;

public class HideArmor extends Armor implements IUseItem {

    public HideArmor() {

        super.setArmortype(Armortype.MEDIUMARMOR);
        super.setCost(10);
        super.setArmorClass(12);
        super.setStrength(0);
        super.setStealthDisadvantage(false);
        super.setWeight(12);
        super.setName("Hide Armor");
    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
