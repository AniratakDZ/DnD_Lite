package Items;

public abstract class Artifact {

    private String name;
    private String art;


    public Artifact(){


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

    public abstract void use();

}