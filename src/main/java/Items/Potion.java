package Items;

public abstract class Potion extends Artifact {

    private int dauer;


    public Potion() {
        setArt();
    }

    public void setArt(){

        super.setArt("Trank");

    }

    public int getDauer() {
        return dauer;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }

    public void trankNutzen(){

    }

}
