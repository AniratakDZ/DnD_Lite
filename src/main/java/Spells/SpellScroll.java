package Spells;

import figures.characters.Characters;

public class SpellScroll{

    Spells spell;

    public SpellScroll(Spells spell ){
        this.spell = spell;
    }

    public void useScroll(Characters character) {
        spell.castSpell(character);
    }

    public String getName(){
        return spell.getName();
    }

    public Spells getSpell() {
        return spell;
    }
}
