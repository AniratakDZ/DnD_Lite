package figures.Monsters;

import figures.Figur;

public abstract class Monsters extends Figur{

    int   constitution;
    String name;

    abstract void move();

    abstract void attack();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }
}
