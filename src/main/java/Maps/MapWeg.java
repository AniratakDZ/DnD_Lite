package Maps;
import java.awt.*;

public class MapWeg extends MapKachel{    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.drawLine(0, 0, 0, getHeight());
        g2d.drawLine(0, 0, getWidth(), 0);
        g2d.drawLine(0, getHeight(), getWidth(), getHeight());
        g2d.drawLine(getWidth(), getHeight(), getWidth(), getHeight());
        //g.drawRect(0,  0, this.getWidth(), this.getHeight());

    }
}
