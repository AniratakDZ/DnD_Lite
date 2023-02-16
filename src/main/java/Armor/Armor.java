package Armor;

public abstract class Armor {

    public enum Armortype {
        LIGHTARMOR,
        MEDIUMARMOR,
        HEAVYARMOR,
        SHIELD
    }

    Armortype armortype;

    int cost, armorClass, strength, weight;
    String name;

    /**
     * What effect das the armor have on the movement
     */
    boolean stealthDisadvantage;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStealthDisadvantage() {
        return stealthDisadvantage;
    }

    public void setStealthDisadvantage(boolean stealthDisadvantage) {
        this.stealthDisadvantage = stealthDisadvantage;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public Armortype getArmortype() {
        return armortype;
    }

    public void setArmortype(Armortype armortype) {
        this.armortype = armortype;
    }
}
