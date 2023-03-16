package Items.armor.MediumArmor;

import Items.IUseItem;
import Items.armor.Armor;
import figures.characters.Characters;

public class ChainShirtArmor extends Armor implements IUseItem {

    public ChainShirtArmor() {

        super.setArmortype(Armortype.MEDIUMARMOR);
        super.setCost(50);
        super.setArmorClass(13);
        super.setStrength(0);
        super.setStealthDisadvantage(true);
        super.setWeight(20);

    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
