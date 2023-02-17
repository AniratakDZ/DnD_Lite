package figures.characters;

import Armor.Armor;
import weapons.IWeaponBehaviour;

public class Fighter extends Characters {



    public Fighter(int strengh, int dexterity, int vitality, int intelligence, int wisdom, int charisma,
                   IWeaponBehaviour mainhand, IWeaponBehaviour offhand, Armor armor) {

        super.inventory = new Inventory();
        super.setStrengh(strengh);
        setDexterity(dexterity);
        setVitality(vitality);
        setIntelligence(intelligence);
        setWisdom(wisdom);
        setCharisma(charisma);

        setMainhand(mainhand);
        setOffhand(offhand);
        setArmor(armor);

    }

//    @Override
//    public void attack() {
//
//    }

    @Override
    public void defend() {

    }
}
