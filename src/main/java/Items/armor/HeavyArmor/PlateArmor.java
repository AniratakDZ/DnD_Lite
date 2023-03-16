package Items.armor.HeavyArmor;

import Items.IUseItem;
import Items.armor.Armor;
import figures.characters.Characters;

public class PlateArmor extends Armor implements IUseItem {

    public PlateArmor() {

        super.setArmortype(Armortype.HEAVYARMOR);
        super.setCost(1500);
        super.setArmorClass(18);
        super.setStrength(15);
        super.setStealthDisadvantage(true);
        super.setWeight(65);

    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
