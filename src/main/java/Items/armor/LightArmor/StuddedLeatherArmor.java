package Items.armor.LightArmor;

import Items.IUseItem;
import Items.armor.Armor;
import figures.characters.Characters;

public class StuddedLeatherArmor extends Armor implements IUseItem {

    public StuddedLeatherArmor() {

        super.setArmortype(Armortype.LIGHTARMOR);
        super.setCost(45);
        super.setArmorClass(12);
        super.setStrength(0);
        super.setStealthDisadvantage(false);
        super.setWeight(10);
        super.setName("Studded Leather Armor");
    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
