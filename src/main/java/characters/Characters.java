package main.characters;

import main.Armor.Armor;
import main.Position;
import main.weapons.IWeaponBehaviour;

public abstract class Characters {

    int strengh, dexterity, vitality, intelligence, wisdom, charisma, level, experience;
    String name;
    int maxLeben, currentLife;
    private IWeaponBehaviour mainhand;
    private IWeaponBehaviour offhand;
    private Armor armor;
    Position positon;

    abstract void attack();

    abstract void defend();

    void move(){

    };

    void take(){

    };

    void useArtifact(){

    };

    void addExperience(){

    };



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

    public int getMaxLeben() {
        return maxLeben;
    }

    public void setMaxLeben(int maxLeben) {
        this.maxLeben = maxLeben;
    }

    public Position getPositon() {
        return positon;
    }

    public void setPositon(Position positon) {
        this.positon = positon;
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
}
