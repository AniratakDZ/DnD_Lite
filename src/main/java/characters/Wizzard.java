package characters;

import Spells.ISpells;
import weapons.IWeaponBehaviour;

public class Wizzard extends Characters {

    public Wizzard(int strengh, int dexterity, int vitality, int intelligence, int wisdom, int charisma, IWeaponBehaviour mainhand, IWeaponBehaviour offhand) {

        super.inventory = new Inventory();
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
    public void attack() {

    }

    @Override
    public void defend() {

    }

    public void castSpell(ISpells spell, Characters character){
        spell.castSpell(character);
    }
}
