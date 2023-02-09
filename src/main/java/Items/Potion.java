package Items;

import characters.Characters;

public abstract class Potion extends Artifact {



    public Potion() {
        setArt();
    }

    public void setArt(){

        super.setArt("Trank");

    }

    public void trankNutzen(Characters characters){

    }

}
