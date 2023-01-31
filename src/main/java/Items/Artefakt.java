package Items;

public abstract class Artefakt {

    private String name;
    private String art;


    public Artefakt(){


    }

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

}
