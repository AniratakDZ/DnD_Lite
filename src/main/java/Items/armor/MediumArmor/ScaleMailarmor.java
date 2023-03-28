package Items.armor.MediumArmor;

import Items.IUseItem;
import Items.armor.Armor;
import figures.characters.Characters;

public class ScaleMailarmor extends Armor implements IUseItem {

    public ScaleMailarmor() {

        super.setArmortype(Armortype.MEDIUMARMOR);
        super.setCost(50);
        super.setArmorClass(14);
        super.setStrength(0);
        super.setStealthDisadvantage(false);
        super.setWeight(45);
        super.setName("Scale Mailarmor");
    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
