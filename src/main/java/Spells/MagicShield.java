package Spells;

import figures.characters.Characters;

public class MagicShield implements ISpells {

    static int castingTime = 1, duration = 0, range = 0, armorclass = 5;

    /**
     *  An invisible barrier of magical force appears and protects
     *  you. Until the start of your next turn, you have a +5 bonus
     *  to AC, including against the triggering attack, and you
     *  take no damage from magic missile.
     * @param character that is the target of the spell
     */
    public void castSpell(Characters character) {
        character.setArmorClass(character.getArmorClass() + armorclass);
    }
}
