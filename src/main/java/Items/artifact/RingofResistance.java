package Items.artifact;

import Mix.DamageType;
import figures.characters.Characters;


public class RingofResistance extends Rings{

    private DamageType damageType;
    public RingofResistance(DamageType damageType) {

        setDamageType(damageType);

    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    @Override
    public void useArtifact(Characters characters) {

        getDamageType();

    }
}