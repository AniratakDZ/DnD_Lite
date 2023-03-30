package figures.characters;

import Items.armor.Armor;
import Items.weapons.Weapons;
import Mix.Dice;

public class Fighter extends Characters {

    public Fighter(int strengh, int dexterity, int vitality, int intelligence, int wisdom, int charisma,
                   Weapons mainhand, Weapons offhand, Armor armor, int armorclass) {

        super(armorclass);
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

    @Override
    public void attack(Characters character) {

        int attack = Dice.rollDiceInt(1, 20 ) + ((getDexterity()-10) / 2);
        if (attack > character.getArmorClass() || attack == character.getArmorClass())
        {

            getMainhand().useArtifact(character);

        }

    }

    @Override
    public int defend() {
        
        int tempAC = 0;
        
        if(armor != null)
        {
            
            tempAC = getArmorClass() + 1;
            
        }
        
        return tempAC;

    }

    @Override
    void move() {

    }
}
