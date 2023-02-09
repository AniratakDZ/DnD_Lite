package main.weapons;

public abstract class Weapons {

    public enum Weapontype {
        onehandedAxe,
        onehandedSword,
        twohandedAxe,
        twohandedSword,
        offhand,
        staff
    }

    Weapontype weapontype;
    int cost, damage, properties, weight;
    String name;

    public Weapontype getWeapontype() {
        return weapontype;
    }

    public void setWeapontype(Weapontype weapontype) {
        this.weapontype = weapontype;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getProperties() {
        return properties;
    }

    public void setProperties(int properties) {
        this.properties = properties;
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
}
