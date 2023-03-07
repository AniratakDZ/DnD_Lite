package Spells;

import figures.characters.Characters;

public class SecondLife extends Spells{

    int castingTime = 8, duration = 1, range = 0, damage = 0, level = 0;
    String name = "SecondLife";

    @Override
    public void castSpell(Characters character) {

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

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
