package Maps;
import java.awt.*;

public class MapWeg extends MapKachel{    

    MapWeg(Position pos) {
        super(pos);
    }

    @Override
    public WayType getWayType() {
        return WayType.WAY;
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(getLineWidth()));
        g.drawRect(0,  0, getWidth() - 1, getHeight() - 1);

    }
}
