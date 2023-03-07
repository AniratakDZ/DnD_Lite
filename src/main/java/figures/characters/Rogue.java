package figures.characters;

import Armor.Armor;
import weapons.IWeaponBehaviour;

public class Rogue extends Characters {

    Armor.Armortype armorType = Armor.Armortype.LIGHTARMOR;

    public Rogue(int strengh, int dexterity, int vitality, int intelligence, int wisdom, int charisma,
                 IWeaponBehaviour mainhand, IWeaponBehaviour offhand, Armor armor) {

        super.inventory = new Inventory();
        setStrengh(strengh);
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

    @Override
    void move() {

    }

    @Override
    public void setArmor(Armor armor) {
        if(armor.getArmortype().equals(armorType)){
            super.setArmor(armor);
        }
    }
}
