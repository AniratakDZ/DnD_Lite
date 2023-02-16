package Spells;
/*
This spell sends creatures into a magical slumber. Roll
        5d8; the total is how many hit points of creatures this
        spell can affect. Creatures within 20 feet of a point you
        choose within range are affected in ascending order of
        their current hit points (ignoring unconscious creatures).
        Starting with the creature that has the lowest current
        hit points, each creature affected by this spell falls unconscious until the spell ends, the sleeper takes damage,
        or someone uses an action to shake or slap the sleeper
        awake. Subtract each creature’s hit points from the total
        before moving on to the creature with the next lowest hit
        points. A creature’s hit points must be equal to or less
        than the remaining total for that creature to be affected.
        Undead and creatures immune to being charmed aren’t
        affected by this spell.
        At Higher Levels. When you cast this spell using a
        spell slot of 2nd level or higher, roll an additional 2d8 for
        each slot level above 1st*/

import Die.Dice;
import characters.Characters;

public class Sleep implements ISpells {

    // Duration 1 Minute
    int castingTime = 1, duration = 1, range = 20, hitPoints;

    public Sleep(){
        Dice.rollMultipleTimesMultiply(8,5);
    }
    @Override
    public void castSpell(Characters character) {

    }
}
