package Items.armor.LightArmor;

import Items.IUseItem;
import Items.armor.Armor;
import figures.characters.Characters;

public class LeatherArmor extends Armor implements IUseItem {

    public LeatherArmor() {

        super.setArmortype(Armortype.LIGHTARMOR);
        super.setCost(10);
        super.setArmorClass(11);
        super.setStrength(0);
        super.setStealthDisadvantage(false);
        super.setWeight(10);

    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
