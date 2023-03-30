package figures.characters;

import Items.weapons.Weapons;

public class Wizzard extends Characters {

    public Wizzard(int strengh, int dexterity, int vitality, int intelligence, int wisdom, int charisma,
                   Weapons mainhand, Weapons offhand, int armorclass) {

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
    }

    @Override
    public void attack(Characters character) {

    }

    @Override
    public int defend() {

        return getArmorClass();

    }

    @Override
    void move() {

    }

    public void castSpell(){
    }
}
