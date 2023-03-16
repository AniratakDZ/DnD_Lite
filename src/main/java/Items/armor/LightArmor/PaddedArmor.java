package Items.armor.LightArmor;

import Items.IUseItem;
import Items.armor.Armor;
import figures.characters.Characters;

public class PaddedArmor extends Armor implements IUseItem {

    public PaddedArmor() {

        super.setArmortype(Armortype.LIGHTARMOR);
        super.setCost(5);
        super.setArmorClass(11);
        super.setStrength(0);
        super.setStealthDisadvantage(true);
        super.setWeight(8);

    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
