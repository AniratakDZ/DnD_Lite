package characters;

import Armor.Armor;
import Items.Artifact;
import Items.IUseArtifact;
import weapons.IWeaponBehaviour;

import java.util.ArrayList;

public abstract class Characters {

    int strengh, dexterity, vitality, intelligence, wisdom, charisma, level, experience, armorClass,
            maxLife, currentLife;
    String name;
    public boolean invisible = false;

    IWeaponBehaviour mainhand;
    IWeaponBehaviour offhand;
    IUseArtifact useArtifact;

    Armor armor;
    Inventory inventory;

//    Position positon;

    public abstract void attack();

    public abstract void defend();

    void move() {

    }

    void take() {

    }

    void dropItem(String artifactName) {
        inventory.remove(inventory.getArtifactByName(artifactName));
    }

    void useArtifact(String artifactName) {
        useArtifact = inventory.getArtifactByName(artifactName);
        useArtifact.useArtifact(this);
    }

    void addExperience() {

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

    public IWeaponBehaviour getMainhand() {
        return mainhand;
    }

    public void setMainhand(IWeaponBehaviour mainhand) {
        this.mainhand = mainhand;
    }

    public IWeaponBehaviour getOffhand() {
        return offhand;
    }

    public void setOffhand(IWeaponBehaviour offhand) {
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

    public void setExperience(int experience) {
        this.experience = experience;
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
