package Spells;


import characters.Characters;

public interface ISpells {

    enum DamageType {
        ACID, COLD, FIRE, FORCE, LIGHTNING, NECROTIC, POISIN, PSYCHIC, RADIANT, THUNDER
    }

    void castSpell(Characters character);

}
