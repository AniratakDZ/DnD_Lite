package Maps;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Maps.MapDoor.DoorType;
import Maps.MapKachel.WayType;
import Maps.*;

import java.awt.*;
import java.util.Random;

public class Map extends JFrame{
    public Map(int width, int height) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        GridLayout layout = new GridLayout();
        layout.setColumns(10);
        layout.setRows(10);
        mainPanel.setLayout(layout);
        add(mainPanel);
        setBounds(100, 100, 500, 500);
        for(int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                WayType type = WayType.values()[((int)((Math.random() * 3)))];
                if(type == WayType.DOOR){
                    int doorType = (int)(Math.random() * DoorType.values().length - 1);
                    mainPanel.add(MapDoor.getMapDoor(DoorType.values()[doorType], new Position(x, y)));
                }
                else if(type == WayType.WAY)
                    mainPanel.add(new MapWeg(new Position(x,y)));
                else
                    mainPanel.add(new MapWand(new Position(x,y)));
                
            }
        }
        setVisible(true);
    }

    public void generateMap() {

    }
}