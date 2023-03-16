package Items.armor.Shield;

import Items.IUseItem;
import Items.armor.Armor;
import figures.characters.Characters;

public class Shield extends Armor implements IUseItem {

    public Shield() {

        super.setArmortype(Armortype.SHIELD);
        super.setCost(10);
        super.setArmorClass(2);
        super.setStrength(0);
        super.setStealthDisadvantage(false);
        super.setWeight(6);

    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
