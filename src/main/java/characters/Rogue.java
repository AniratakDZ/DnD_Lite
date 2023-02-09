package characters;

import characters.Characters;
import main.Armor.Armor;
import main.weapons.IWeaponBehaviour;

public class Rogue extends Characters {

    Armor.Armortype armorType = Armor.Armortype.LIGHTARMOR;

    public Rogue(int strengh, int dexterity, int vitality, int intelligence, int wisdom, int charisma,
                 IWeaponBehaviour mainhand, IWeaponBehaviour offhand, Armor armor) {

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
    void attack() {

    }

    @Override
    void defend() {

    }

    @Override
    public void setArmor(Armor armor) {
        if(armor.getArmortype().equals(armorType)){
            super.setArmor(armor);
        }
    }
}
