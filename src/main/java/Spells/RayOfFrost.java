package Spells;

import characters.Characters;

/*
A frigid beam of blue-white light streaks toward a creature within range. Make a ranged spell attack against the
        target. On a hit, it takes 1d8 cold damage, and its speed is
        reduced by 10 feet until the start of your next turn.
        The spell’s damage increases by 1d8 when you reach
        5th level (2d8), 11th level (3d8), and 17th level (4d8)*/

public class RayOfFrost implements ISpells{

    damagetype damagetype;
    int castingTime = 1, duration = 0, range = 60;

    @Override
    public void castSpell(Characters character) {

    }
}
