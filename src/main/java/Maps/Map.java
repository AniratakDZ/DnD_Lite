package Maps;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Map extends JFrame{
    public Map(int width, int height) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        GridLayout layout = new GridLayout();
        layout.setColumns(10);
        layout.setRows(10);
        layout.setHgap(15);
        layout.setVgap(15);
        mainPanel.setLayout(layout);
        add(mainPanel);
        setBounds(100, 100, 500, 500);
        
        for (int i = 0; i < 100; i++) {
            mainPanel.add(new MapWeg());
        }
        setVisible(true);
    }

    public void generateMap() {

    }
}