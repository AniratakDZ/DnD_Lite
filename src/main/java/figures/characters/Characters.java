package figures.characters;

import Items.armor.Armor;
import Items.artifact.Artifact;
import Items.IUseItem;
import Items.weapons.Weapons;
import figures.Figur;

import java.util.ArrayList;

public abstract class Characters extends Figur{

    int strengh, dexterity, vitality, intelligence, wisdom, charisma, level = 1, experience, armorClass,
            maxLife, currentLife;
    String name;
    public boolean invisible = false;
    Weapons mainhand;
    Weapons offhand;
    IUseItem useArtifact;
    Armor armor;
    Inventory inventory;

//    abstract void attack(Characters character);

    public abstract void defend();

    abstract void move();

    void take(Artifact artifact) {
        inventory.add(artifact);
    }

    void dropItem(String artifactName) {
        inventory.remove(inventory.getArtifactByName(artifactName));
    }

    void useArtifact(String artifactName) {
        useArtifact = inventory.getArtifactByName(artifactName);
        useArtifact.useArtifact(this);
    }

    // ----------------------------------- Inner Class Inventory -----------------------------------
    public class Inventory extends ArrayList<Artifact> {

        public Artifact getArtifactByName(String itemName) {

            int tmp = 0;

            for (Artifact ar : this) {
                if (ar.getName().equals(itemName)) {
                    return this.get(tmp);
                }
            }
            return null;
        }
    }
    // ----------------------------------- Getter & Setter -----------------------------------

    public int getStrengh() {
        return strengh;
    }

    public void setStrengh(int strengh) {
        this.strengh = strengh;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int getCurrentLife() {
        return currentLife;
    }

    public void setCurrentLife(int currentLife) {
        this.currentLife = currentLife;
    }

    public boolean isInvisible() {
        return invisible;
    }

    public void setInvisible(boolean invisible) {
        this.invisible = invisible;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }
}
