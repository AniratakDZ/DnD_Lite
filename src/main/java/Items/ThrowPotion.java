package Items;

public abstract class ThrowPotion extends Potion {

    int range;
    public ThrowPotion(){

        setRange(5);

    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
