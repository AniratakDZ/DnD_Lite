package Items.artifact;

import Items.ChestItems;
import Items.IUseItem;

public abstract class Artifact extends ChestItems implements IUseItem {

    private String name;
    private String art;

    private int duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art){

        this.art = art;

    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}