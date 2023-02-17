package Spells;

import Mix.DamageType;
import figures.characters.Characters;

public class MagicMist extends Spells{

//    DamageType damageType;
//
//    public MagicMist(){
//        damageType = DamageType.FIRE;
//        super.setLevel(0);
//        super.setName("MagicMist");
//        super.setCastingTime(1);
//        super.setDuration(0);
//        super.setRange(150);
//        super.setSpellPower(0);
//    }

    @Override
    public void castSpell(Characters character) {

    }

//    public DamageType getDamageType() {
//        return damageType;
//    }

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
