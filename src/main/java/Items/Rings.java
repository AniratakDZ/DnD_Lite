package Items;

import characters.Characters;

public abstract class Rings extends Artifact{



    public Rings(){

        setArt("Ring");

    }


    public abstract void useArtifact(Characters characters);
}
