package Spells;

import Mix.DamageType;
import Mix.Dice;
import figures.characters.Characters;

public class BruningHands extends Spells {

    DamageType damageType;

    public BruningHands() {
        damageType = DamageType.FIRE;
        super.setLevel(0);
        super.setName("BruningHands");
        super.setCastingTime(1);
        super.setDuration(0);
        super.setRange(15);
        super.setSpellPower(Dice.rollDiceInt(3, 6));
    }


    /**
     *     Burning Hands
     *     1st-level evocation
     *     Casting Time: 1 action
     *     Range: Self (15-foot cone)
     *     Components: V, S
     *     Duration: Instantaneous
     *     As you hold your hands with thumbs touching and fingers
     *     spread, a thin sheet of flames shoots forth from your outstretched fingertips. Each creature in a 15-foot cone must
     *     make a Dexterity saving throw. A creature takes 3d6 fire
     *     damage on a failed save, or half as much damage on a
     *     successful one.
     *     The fire ignites any flammable objects in the area that
     *     aren’t being worn or carried.
     *     At Higher Levels. When you cast this spell using a
     *     spell slot of 2nd level or higher, the damage increases by
     *     1d6 for each slot level above 1st
     * @param target
     */
    @Override
    public void castSpell(Characters target) {

    }

    public DamageType getDamageType() {
        return damageType;
    }

    public int getCastingTime() {
        return castingTime;
    }

    public int getDuration() {
        return duration;
    }

    public int getRange() {
        return range;
    }

    public String getName() {
        return name;
    }

    public int getSpellPower() {
        return spellPower;
    }
}
