package Items;
import javax.swing.*;

public abstract class ChestItems extends JPanel implements IUseItem {


    private String name;



    public void setName(String name){this.name = name;}

    public String getName(){return name;}


}
