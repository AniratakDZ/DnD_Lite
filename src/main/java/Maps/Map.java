package Maps;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import Maps.MapDoor.DoorType;
import Maps.MapKachel.WayType;
import figures.Figur;
import figures.MapItems;
import figures.characters.Characters;
import figures.characters.Fighter;
import Maps.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Map extends JPanel {
    private ArrayList<Figur> figuren = new ArrayList<>();
    private HashMap<Position, MapKachel> myMap = new HashMap<Position, MapKachel>();
    private MapKachel m_kachel;
    
    public Map(int width, int height) {
        // JPanel mainPanel = new JPanel();
        MapKachel tmp = MapDoor.getMapDoor(DoorType.DOOR_OPEN, new Position(0, 0));

        // mapPanel.setBounds(getBounds());
        // tmp.setVisible(true);
        // mapPanel.setVisible(true);


        GridLayout layout = new GridLayout();
        layout.setColumns(width);
        layout.setRows(height);
        setLayout(layout);
        for(int x = 0; x < layout.getColumns(); x++) {
            for (int y = 0; y < layout.getRows(); y++) {
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
                // JLayeredPane pane = new JLayeredPane();
                JPanel tmp2 = new JPanel();
                tmp2.setBackground(Color.green);
                JPanel tmp3 = new JPanel();
                tmp3.setBackground(Color.red);
                JPanel tmp4 = new JPanel();
                tmp4.setBackground(Color.yellow);

                // // tmp.setVisible(true);
                // pane.add(tmp2,0);
                // pane.add(kachel,1);
                // pane.setVisible(true);
                
                // tmp2.setBounds(kachel.getBounds());
                // add(pane);
                //System.out.println("x: " + x + "\ty: " + y);
                m_kachel = kachel;
                add(kachel);
                myMap.put(new Position(x,y), kachel);
            }
        }
        setVisible(true);
    }

    public void generateMap() {

    }

    public void addFigur(Figur figur, Position position) {
        System.out.println("////////////////////////////////");
        Position pos = null;
        for(Position tmp : myMap.keySet()) {
            if(position.equals(tmp)) {
                System.out.println("x: " + tmp.getX() + "\ty: " + tmp.getY() + "\t" + myMap.containsKey(tmp));
                pos = tmp;
                break;
            }
        }
        if(pos == null)
            return;
        System.out.println("x: " + position.getX() + "\ty: " + position.getY() + "Map Size: " + myMap.size() + " :: " + myMap.containsKey(pos));
        System.out.println("Test: " + myMap.get(pos));// == null ? "null" : "gefunden");
        JPanel panel = new JPanel();
        panel.setBackground(Color.green);
        m_kachel.add(panel);
        m_kachel.repaint();
        panel.repaint();

        JPanel tmp2 = new JPanel();
        tmp2.setBackground(Color.green);
        // myMap.get(pos)
        repaint();
        ((MapKachel)(this.getComponent(pos.getY()*10 + pos.getX()))).add(tmp2);
        repaint();
    }
    public void addLoot(MapItems loot, Position pos) {

    }
    public void addFigure(Figur figur, Position pos) {

    }
    public void moveFigureToPos(Figur figur, Position pos) {

    }
    public void removeFigure(Figur figur) {

    }
    public Characters getPlayer(Position pos) { 
        return null;
    }
    public MapItems getEntity(Position pos) {
        return null;    
    }
}