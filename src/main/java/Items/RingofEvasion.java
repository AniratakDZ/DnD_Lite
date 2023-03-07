package Items;

import figures.characters.Characters;

public class RingofEvasion extends Rings {

    private int charges;

    public RingofEvasion() {

        setCharges(3);

    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    @Override
    public void useArtifact(Characters characters) {


        setCharges(getCharges() - 1);

    }
}
