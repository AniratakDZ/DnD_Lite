package Spells;

import figures.characters.Characters;

public class MageArmor extends Spells {

    int castingTime = 8, duration = 1, range = 0, armorclass = 13;
    String name = "MageArmor";

    public MageArmor(){
        super.setName("MageArmor");
        super.setLevel(0);
        super.setCastingTime(1);
        super.setDuration(0);
        super.setRange(0);
        super.setSpellPower(13);
    }

    /**
     * You touch a willing creature who isn’t wearing armor,
     *         and a protective magical force surrounds it until the spell
     *         ends. The target’s base AC becomes 13 + its Dexterity
     *         modifier. The spell ends if the target dons armor or if you
     *         dismiss the spell as an action.
     * @param character
     */
    @Override
    public void castSpell(Characters character) {

        if (character.getArmor() == null) {
            character.setArmorClass(spellPower + character.getDexterity());
        }else{
            System.out.println("Dieser Zauber kann nicht auf einen Character angewendet werden, der eine Rüstung trägt");
        }
    }
}
