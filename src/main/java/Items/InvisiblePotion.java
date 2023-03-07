package Items;

import figures.characters.Characters;

public class InvisiblePotion extends Potion {

        public InvisiblePotion(Characters characters) {

            setName("Potion of invisibility");
            setDuration(5);

        }

    @Override
    public void useArtifact(Characters characters) {
        characters.setInvisible(true);
    }
}

