package Spells;

import Mix.DamageType;
import figures.characters.Characters;

public class HealingHands extends Spells {

    public HealingHands(){
        super.setName("HealingHands");
        super.setLevel(0);
        super.setCastingTime(1);
        super.setDuration(0);
        super.setRange(15);
        super.setSpellPower(0);
    }

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

    public int getSpellPower() {
        return spellPower;
    }

    public String getName() {
        return name;
    }
}
