package Items.weapons.onehanded;

import Items.IUseItem;
import Mix.Dice;
import Items.weapons.Weapons;
import figures.characters.Characters;


public class Handaxe extends Weapons implements IUseItem {

    public Handaxe(){

        super.setWeapontype(Weapons.Weapontype.ONEHANDED_AXE);
        super.setCost(5);
        super.setDamage(Dice.rollDiceInt(1,6));
        super.setWeight(2);
        super.setName("Handaxe");
    }

    @Override
    public void useArtifact(Characters characters) {

    }
}
