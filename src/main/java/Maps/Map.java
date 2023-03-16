package Maps;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Maps.MapDoor.DoorType;
import Maps.MapKachel.WayType;
import figures.Figur;
import Maps.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Map extends JPanel {
    private ArrayList<Figur> figuren = new ArrayList<>();
    private HashMap myMap = new HashMap<>();
    private FigurMap figurMap;
    
    public Map(int width, int height) {
        // JPanel mainPanel = new JPanel();
        figurMap = new FigurMap(width, height);
        GridLayout layout = new GridLayout();
        layout.setColumns(10);
        layout.setRows(10);
        setLayout(layout);
        // add(mainPanel);
        for(int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                Position pos = new Position(x, y);
                MapKachel kachel;
                WayType type = WayType.values()[((int)((Math.random() * 3)))];
                if(type == WayType.DOOR){
                    int doorType = (int)(Math.random() * DoorType.values().length - 1);
                    kachel = MapDoor.getMapDoor(DoorType.values()[doorType], pos);
                }
                else if(type == WayType.WAY)
                    kachel = new MapWeg(pos);
                else
                    kachel = new MapWand(pos);
                myMap.put(kachel, pos);
                add(kachel);
            }
        }
        setVisible(true);
    }

    public void generateMap() {

    }
}