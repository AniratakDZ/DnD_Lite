package Maps;

import javax.swing.JPanel;
import java.awt.*;


public abstract class MapKachel extends JPanel {
    private Position m_pos;

    public MapKachel(Position pos) {
        m_pos = pos;
        setOpaque(false);
        GridLayout layout = new GridLayout();
        setLayout(layout);
    }
    
    public Position getPos() {
        return m_pos;
    }

    public enum WayType {
        DOOR,
        WAY,
        WALL
    }

    public abstract WayType getWayType();
    
    private int lineWidth = 0;
    protected int getLineWidth() {
        return lineWidth;
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        lineWidth =  getWidth() / 12;
        // if(m_player != null) {

        // }
    }
}
