package figures;


import Items.IUseItem;
import Maps.Position;

public class Chest extends MapItems {

    IUseItem[] itemList;

    public Chest(IUseItem[] itemList, Position position) {
        this.itemList = itemList;
        super.setNewPosition(position);
    }

    public IUseItem[] lootChest() {
        return this.itemList;
    }

}
