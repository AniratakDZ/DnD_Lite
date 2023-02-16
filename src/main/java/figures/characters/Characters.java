package figures.characters;

import Armor.Armor;
import Items.Artifact;
import Items.IUseArtifact;
import weapons.IWeaponBehaviour;

import java.util.ArrayList;

public abstract class Characters {

    int strengh, dexterity, vitality, intelligence, wisdom, charisma, level = 1, experience, armorClass,
            maxLife, currentLife;
    String name;
    public boolean invisible = false;
    IWeaponBehaviour mainhand;
    IWeaponBehaviour offhand;
    IUseArtifact useArtifact;
    Armor armor;
    Inventory inventory;

    //    Position positon;
    public void attack(Characters character) {

    }

    ;

    public abstract void defend();

    void move() {

    }

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

    void addExperience(int experience) {

        this.experience = +experience;

        if (this.experience >= 300 && this.experience < 900) {
            setLevel(2);
        } else if (this.experience >= 900 && this.experience < 2700) {
            setLevel(3);
        } else if (this.experience >= 6500 && this.experience < 14000) {
            setLevel(4);
        } else if (this.experience >= 14000 && this.experience < 23000) {
            setLevel(5);
        } else if (this.experience >= 23000 && this.experience < 34000) {
            setLevel(6);
        } else if (this.experience >= 34000 && this.experience < 48000) {
            setLevel(7);
        } else if (this.experience >= 48000 && this.experience < 64000) {
            setLevel(8);
        } else if (this.experience >= 64000 && this.experience < 85000) {
            setLevel(9);
        } else if (this.experience >= 85000 && this.experience < 100000) {
            setLevel(10);
        } else if (this.experience >= 100000 && this.experience < 120000) {
            setLevel(11);
        } else if (this.experience >= 120000 && this.experience < 140000) {
            setLevel(12);
        } else if (this.experience >= 140000 && this.experience < 165000) {
            setLevel(13);
        } else if (this.experience >= 165000 && this.experience < 190000) {
            setLevel(14);
        } else if (this.experience >= 195000 && this.experience < 225000) {
            setLevel(15);
        } else if (this.experience >= 225000 && this.experience < 265000) {
            setLevel(16);
        }else if (this.experience >= 265000 && this.experience < 305000) {
            setLevel(17);
        }else if (this.experience >= 305000 && this.experience < 355000) {
            setLevel(18);
        }
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
