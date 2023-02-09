package characters;

import main.weapons.IWeaponBehaviour;

public class Wizzard extends Characters {

    public Wizzard(int strengh, int dexterity, int vitality, int intelligence, int wisdom, int charisma, IWeaponBehaviour mainhand, IWeaponBehaviour offhand) {

        setStrengh(strengh);
        setDexterity(dexterity);
        setVitality(vitality);
        setIntelligence(intelligence);
        setWisdom(wisdom);
        setCharisma(charisma);

        setMainhand(mainhand);
        setOffhand(offhand);
    }


    @Override
    void attack() {

    }

    @Override
    void defend() {

    }
}
