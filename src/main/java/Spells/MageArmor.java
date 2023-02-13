package Spells;

/*
You touch a willing creature who isn’t wearing armor,
        and a protective magical force surrounds it until the spell
        ends. The target’s base AC becomes 13 + its Dexterity
        modifier. The spell ends if the target dons armor or if you
        dismiss the spell as an action.*/

import characters.Characters;

public class MageArmor implements ISpells {

    int castingTime = 8, duration = 1, range = 0, armorclass = 13;

    @Override
    public void castSpell(Characters character) {
        character.setArmorClass(armorclass + character.getDexterity());
    }
}
