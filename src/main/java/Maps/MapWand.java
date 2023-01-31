package Maps;
import java.awt.Color;
import java.awt.Graphics;

public class MapWand extends MapKachel {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,  0, this.getWidth(), this.getHeight());
    }
}
