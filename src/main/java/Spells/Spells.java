package Spells;

import figures.characters.Characters;

public abstract class Spells {

    int castingTime = 1, duration = 0, range = 0, spellPower = 0, areaOfEffect, level;
    String name;

    abstract void castSpell(Characters character);

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

    public int getAreaOfEffect() {
        return areaOfEffect;
    }

    public String getName() {
        return name;
    }

    public void setCastingTime(int castingTime) {
        this.castingTime = castingTime;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public void setAreaOfEffect(int areaOfEffect) {
        this.areaOfEffect = areaOfEffect;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
