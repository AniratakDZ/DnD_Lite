package figures.Monsters;

public class Skeleton extends Monsters{

    public Skeleton(){

        super.setName("Skeleton");
        super.setStrengh(10);
        super.setDexterity(14);
        super.setConstitution(15);
        super.setIntelligence(6);
        super.setWisdom(8);
        super.setCharisma(5);
        super.setArmorClass(13);
        super.setMaxLife(13);
        super.setCurrentLife(13);
        super.setSpeed(30);

    }

    @Override
    void move() {

    }

    @Override
    void attack() {

    }
}
