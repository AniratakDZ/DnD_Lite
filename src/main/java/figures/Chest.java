package figures;

import Items.ChestItems;
import figures.characters.Characters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Chest extends MapItems{

    private ArrayList<ChestItems> inventory = new ArrayList<>();

    int slots;

    public Chest(int slots){

        setSlots(slots);

    }

    public int getSlots() {
        return slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public void addItem(ChestItems item){

        if (inventory.size() < slots){

            inventory.add(item);

        }

    }

    public void looten(Characters player){

        for (int i = 0; i < inventory.size(); i ++)
        {

            player.take(inventory.get(i));

        }

    }

}
