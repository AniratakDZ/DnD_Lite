package Items.weapons;

import Items.ChestItems;

public abstract class Weapons extends ChestItems {

    public enum Weapontype {
        ONEHANDED_AXE, ONEHANDED_SWORD, TWOHANDED_AXE, TWOHANDED_SWORD, OFFHAND, STAFF, ONEHANDED_RANGE, TWOHANDED_RANGE, UNARMED
    }

    Weapontype weapontype;
    int cost, damage, properties, weight, normalRange, longRange;
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

    public int getNormalRange() {
        return normalRange;
    }

    public void setNormalRange(int normalRange) {
        this.normalRange = normalRange;
    }

    public int getLongRange() {
        return longRange;
    }

    public void setLongRange(int longRange) {
        this.longRange = longRange;
    }
}
