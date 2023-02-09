package Maps;
import java.awt.*;

public class MapDoor extends MapWeg{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        System.out.println(getWidth() + " :: " + getHeight());
        g2d.drawRect((int)(getWidth() / 4.0), (int)(getHeight() / 4.0), (int)(getWidth() / 2.0) - 1, (int)(getHeight() / 2) - 1);
        //g2d.
    }
}
