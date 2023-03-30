package Maps;

import javax.swing.JPanel;

import Maps.MapDoor.DoorType;
import Maps.MapKachel.WayType;
import figures.Figur;
import figures.MapItems;
import figures.characters.Characters;

import java.awt.*;
import java.util.ArrayList;

public class Map extends JPanel {
    private ArrayList<Figur> figuren = new ArrayList<>();
    private ArrayList<MapKachel> m_list = new ArrayList<>();
    
    public Map(int width, int height) {
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
                // JPanel tmp2 = new JPanel();
                // tmp2.setBackground(Color.green);
                // JPanel tmp3 = new JPanel();
                // tmp3.setBackground(Color.red);
                // JPanel tmp4 = new JPanel();
                // tmp4.setBackground(Color.yellow);

                // // tmp.setVisible(true);
                // pane.add(tmp2,0);
                // pane.add(kachel,1);
                // pane.setVisible(true);
                
                // tmp2.setBounds(kachel.getBounds());
                // add(pane);
                //System.out.println("x: " + x + "\ty: " + y);

                // m_kachel.add(tmp2);
                m_list.add(kachel);
                add(kachel);
            }
        }
        setVisible(true);
    }

    public void generateMap() {

    }

    public void addFigur(Figur figur, Position position) {
        // System.out.println("////////////////////////////////");
        // MapKachel kachel = getMapKachel(position);
        // if(kachel != null)
        //     kachel.add(figur);  
        // // kachel.isAncestorOf(null);
        // // getMapKachel(position).repaint();

        // repaint();
        // kachel.repaint();
        // figur.repaint();
        getMapKachel(position).add(figur);
        getMapKachel(position).repaint();
        figur.repaint();
        repaint();
    }

    public void addLoot(MapItems loot, Position position) {
        MapKachel kachel = getMapKachel(position);
        if(kachel != null)
            kachel.add(loot); 
    }
    // public void addFigure(Figur figur, Position pos) {

    // }
    public void moveFigureToPos(Figur figur, Position pos) {
        for(MapKachel tmp : m_list) {
            if(tmp.isAncestorOf(figur)) {
                System.out.println("x: " + tmp.getPos().getX() + "\ty: " + tmp.getPos().getY());
                tmp.remove(figur);
                tmp.repaint();
                break;
            }
        }
        getMapKachel(pos).add(figur);
        getMapKachel(pos).repaint();
        figur.repaint();
        repaint();
    }
    public void removeFigure(Figur figur) {

        for(MapKachel tmp : m_list) {
            if(tmp.isAncestorOf(figur)) {
                System.out.println("x: " + tmp.getPos().getX() + "\ty: " + tmp.getPos().getY());
                tmp.remove(figur);
                tmp.repaint();
                break;
            }
        }
    }
    public Characters getPlayer(Position pos) { 
        return null;
    }
    public MapItems getEntity(Position pos) {
        return null;    
    }

    // @Override
    // public void repaint() {
    //     super.repaint();
    //     for(Component c : getComponents())
    //         c.repaint();
    // }

    private MapKachel getMapKachel(Position pos) {
        for(Component tmp: getComponents())
            if(((MapKachel)tmp).getPos().equals(pos)) {
                return (MapKachel)tmp;
            }
        return null;
    }
    public void setKachel(MapKachel kachel, Position pos) {
        // lm_list. getMapKachel(pos) = kachel;
        //m_list.set(m_list.indexOf(getMapKachel(pos)), kachel);
        for(int i = 0; i < getComponentCount(); i++)
            if(((MapKachel)getComponent(i)).getPos().equals(pos)) {
                remove(i);
                add(kachel, i);
            }
    }
}