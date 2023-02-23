package figures.Monsters;

public class Cultist extends Monsters{

    public Cultist(){

        super.setName("Cultist");
        super.setStrengh(11);
        super.setDexterity(12);
        super.setConstitution(10);
        super.setIntelligence(10);
        super.setWisdom(11);
        super.setCharisma(10);
        super.setArmorClass(12);
        super.setMaxLife(9);
        super.setCurrentLife(9);
        super.setSpeed(30);

    }

    @Override
    void move() {

    }

    @Override
    void attack() {

    }
}
