package figures;
import java.awt.*;

public class Figur extends MapItems{
    private Color m_color = null;

    public Figur() {
        repaint();
    }

    public Figur(Color color) {
        m_color = color;
        repaint();
    }

    public void setColor(Color color) {
        m_color = color;
        repaint();
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(m_color);
        g.fillOval(0 + 5, 0 + 5, getWidth() - 10, getHeight() - 10);
        g.setColor(Color.black);
        g.drawOval(0 + 5, 0 + 5, getWidth() - 10, getHeight() - 10);
        System.out.println("Paint");
    }
}
