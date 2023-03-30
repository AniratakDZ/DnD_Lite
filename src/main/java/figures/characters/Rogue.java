package figures.characters;

import Items.armor.Armor;
import Items.weapons.Weapons;

public class Rogue extends Characters {

    Armor.Armortype armorType = Armor.Armortype.LIGHTARMOR;

    public Rogue(int strengh, int dexterity, int vitality, int intelligence, int wisdom, int charisma,
                 Weapons mainhand, Weapons offhand, Armor armor, int armorclass) {

        super(armorclass);
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

    @Override
    public void attack(Characters character) {

        super.attack(character);

    }

    @Override
    public int defend() {

        return getArmorClass();

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
