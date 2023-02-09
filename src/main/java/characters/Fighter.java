package characters;

import main.Armor.Armor;
import main.weapons.IWeaponBehaviour;

public class Fighter extends Characters {



    public Fighter(int strengh, int dexterity, int vitality, int intelligence, int wisdom, int charisma,
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
}
