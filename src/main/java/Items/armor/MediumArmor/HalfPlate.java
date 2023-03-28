package Items.armor.MediumArmor;

import Items.IUseItem;
import Items.armor.Armor;
import figures.characters.Characters;

public class HalfPlate extends Armor implements IUseItem {

    public HalfPlate() {

        super.setArmortype(Armortype.MEDIUMARMOR);
        super.setCost(750);
        super.setArmorClass(15);
        super.setStrength(0);
        super.setStealthDisadvantage(true);
        super.setWeight(40);
        super.setName("Half Plate");
    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
