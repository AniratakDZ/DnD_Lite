package Spells;
/*
A bright streak flashes from your pointing finger to a
        point you choose within range and then blossoms with
        a low roar into an explosion of flame. Each creature
        in a 20-foot-radius sphere centered on that point must
        make a Dexterity saving throw. A target takes 8d6 fire
        damage on a failed save, or half as much damage on a
        successful one.
        The fire spreads around corners. It ignites flammable
        objects in the area that aren’t being worn or carried.
        At Higher Levels. When you cast this spell using a
        spell slot of 4th level or higher, the damage increases by
        1d6 for each slot level above 3rd.*/

import Mix.Dice;
import Mix.DamageType;
import figures.characters.Characters;

public class Fireball extends Spells {

    DamageType damageType;

    public Fireball(){
        damageType = DamageType.FIRE;
        super.setLevel(0);
        super.setName("Fireball");
        super.setCastingTime(1);
        super.setDuration(0);
        super.setRange(150);
        super.setSpellPower(0);
    }

    @Override
    public void castSpell(Characters character) {

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

    public int getSpellPower() {
        return spellPower;
    }

    public String getName() {
        return name;
    }
}
