package Items.armor.MediumArmor;

import Items.IUseItem;
import Items.armor.Armor;
import figures.characters.Characters;

public class BreastplateArmor extends Armor implements IUseItem {

    public BreastplateArmor() {

        super.setArmortype(Armortype.MEDIUMARMOR);
        super.setCost(400);
        super.setArmorClass(14);
        super.setStrength(0);
        super.setStealthDisadvantage(false);
        super.setWeight(20);
        super.setName("Breast Plate");
    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
