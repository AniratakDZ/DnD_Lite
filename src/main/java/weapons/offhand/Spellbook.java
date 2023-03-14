package Weapons.offhand;

import Mix.Dice;
import Spells.Spells;
import weapons.IWeaponBehaviour;

import java.lang.reflect.Array;

//A wizard spell on a spell scroll can be copied just as
//        spells in spellbooks can be copied. When a spell is copied
//        from a spell scroll, the copier must succeed on an Intelligence (Arcana) check with a DC equal to 10 + the spell’s
//        level. If the check succeeds, the spell is successfully copied. Whether the check succeeds or fails, the spell scroll
//        is destroyed.

public class Spellbook implements IWeaponBehaviour {

    Spells spell;
    Spells[] spellbookContent = new Spells[20];

    /** Ties to put a spell from a spell scroll to a spellbook.
     *
     * @param spell The spell you want to put in your  spellbook.
     */
    public void createSpellScroll(Spells spell){

//        if(Dice.rollOnce(20) >= 10 + spell.getLevel()){
//
//        }
    }

    @Override
    public void useWeapon() {

    }
}
