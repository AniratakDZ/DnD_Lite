package Spells;

import Mix.DamageType;
import figures.characters.Characters;

/*
A frigid beam of blue-white light streaks toward a creature within range. Make a ranged spell attack against the
        target. On a hit, it takes 1d8 cold damage, and its speed is
        reduced by 10 feet until the start of your next turn.
        The spell’s damage increases by 1d8 when you reach
        5th level (2d8), 11th level (3d8), and 17th level (4d8)
*/

public class RayOfFrost extends Spells{

    DamageType damageType;

    public RayOfFrost(){
        damageType = DamageType.COLD;
        super.setLevel(0);
        super.setName("RayOfFrost");
        super.setCastingTime(1);
        super.setDuration(0);
        super.setRange(60);
        super.setSpellPower(0);
    }

    @Override
    public void castSpell(Characters character) {

    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
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
}
