package Spells;

import Mix.DamageType;
import figures.characters.Characters;

public class MagicShield extends Spells {

    int armorClass;

    public MagicShield(){
        super.setName("MagicShield");
        super.setLevel(0);
        armorClass = 5;
    }

    /**
     *  An invisible barrier of magical force appears and protects
     *  you. Until the start of your next turn, you have a +5 bonus
     *  to AC, including against the triggering attack, and you
     *  take no damage from magic missile.
     * @param character that is the target of the spell
     */
    public void castSpell(Characters character) {
        character.setArmorClass(character.getArmorClass() + armorClass);
    }
}
