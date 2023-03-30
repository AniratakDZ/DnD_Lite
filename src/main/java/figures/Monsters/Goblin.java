package figures.Monsters;

public class Goblin extends Monsters{

    public Goblin(){

        super.setName("Goblin");
        super.setStrengh(10);
        super.setDexterity(14);
        super.setConstitution(15);
        super.setIntelligence(10);
        super.setWisdom(8);
        super.setCharisma(8);
        super.setArmorClass(15);
        super.setMaxLife(7);
        super.setCurrentLife(7);

    }

    @Override
    void move() {

    }

    @Override
    void attack() {

    }
}