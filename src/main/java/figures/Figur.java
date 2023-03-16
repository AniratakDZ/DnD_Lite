package figures;

import javax.swing.JPanel;

import Maps.MapKachel;
import Maps.Position;

import java.awt.*;

public class Figur extends MapItems{
    private Color m_color = null;

    public Figur() {

    }

    public Figur(Color color) {
        m_color = color;
    }

    public void setColor(Color color) {
        m_color = color;
        repaint();
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(m_color);
        g.fillOval(0, 0, getHeight(), getWidth());
        g.setColor(Color.black);
        g.drawOval(0, 0, getHeight(), getWidth());
    }
}
