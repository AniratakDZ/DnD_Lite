package Items.armor.HeavyArmor;

import Items.IUseItem;
import Items.armor.Armor;
import figures.characters.Characters;

public class SplintArmor extends Armor implements IUseItem {

    public SplintArmor() {

        super.setArmortype(Armortype.HEAVYARMOR);
        super.setCost(200);
        super.setArmorClass(17);
        super.setStrength(15);
        super.setStealthDisadvantage(true);
        super.setWeight(60);
        super.setName("Splint Armor");
    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
