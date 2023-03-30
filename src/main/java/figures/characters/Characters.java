package figures.characters;

import Items.ChestItems;
import Items.armor.Armor;
import Items.artifact.Artifact;
import Items.IUseItem;
import Items.weapons.Weapons;
import figures.Figur;

import java.util.ArrayList;

public abstract class Characters extends Figur{
    public boolean invisible = false;
    Weapons mainhand;
    Weapons offhand;
    IUseItem useArtifact;
    Armor armor;
    Inventory inventory;

    public Characters(int armorclass){

        setArmorClass(armorclass);

    }

    public abstract void attack(Characters character);

    public abstract int defend();

    abstract void move();

    public void take(ChestItems item) {
        inventory.add(item);
    }

    void dropItem(String artifactName) {
        inventory.remove(inventory.getArtifactByName(artifactName));
    }

    void useArtifact(String artifactName) {
        useArtifact = inventory.getArtifactByName(artifactName);
        useArtifact.useArtifact(this);
    }

    // ----------------------------------- Inner Class Inventory -----------------------------------
    public class Inventory extends ArrayList<ChestItems> {

        public ChestItems getArtifactByName(String itemName) {

            int tmp = 0;

            for (ChestItems ar : this) {
                if (ar.getName().equals(itemName)) {
                    return this.get(tmp);
                }
            }
            return null;
        }
    }
    // ----------------------------------- Getter & Setter -----------------------------------

    public Weapons getMainhand() {
        return mainhand;
    }

    public void setMainhand(Weapons mainhand) {
        this.mainhand = mainhand;
    }

    public Weapons getOffhand() {
        return offhand;
    }

    public void setOffhand(Weapons offhand) {
        this.offhand = offhand;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isInvisible() {
        return invisible;
    }

    public void setInvisible(boolean invisible) {
        this.invisible = invisible;
    }

}
