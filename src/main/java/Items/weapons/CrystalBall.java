package Items.weapons;

import Items.IUseItem;
import figures.characters.Characters;

public class CrystalBall extends Weapons implements IUseItem {

    @Override
    public void useArtifact(Characters characters) {
        System.out.println("Kristallkugel macht Kristallkugelsachen");
    }
}
