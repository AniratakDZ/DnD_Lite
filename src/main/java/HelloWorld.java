import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import Items.IUseItem;
import Items.armor.HeavyArmor.ChainMail;
import Items.artifact.InvisiblePotion;
import Items.weapons.onehanded.ShortSword;
import Maps.Map;
import Maps.MapDoor;
import Maps.MapKachel;
import Maps.Position;
import Maps.MapDoor.DoorType;
import Spells.BruningHands;
import Spells.Fireball;
import Spells.SpellScroll;
import figures.characters.Fighter;
import figures.Figur;
import figures.characters.Wizzard;
import java.awt.event.*;

/*  Created on 30.01.2023
 *
 *  Copyright (c) 2023
 *  topsystem GmbH, Aachen, Germany
 *
 *  All rights reserved
 */

/**
 * @author <a href="mailto:fabian.stetter@epg.com">Fabian Stetter</a>
 */
public class HelloWorld {

    public HelloWorld() {
        
        JFrame frame = new JFrame();
        
        Map map = new Map(10, 10);
        frame.setBounds(100, 100, 500, 500);
        // map.setBounds(0,0,500,500);
        // pane.setPreferredSize(new Dimension(frame.getWidth(), frame.getHeight()));
        // JPanel panel = new JPanel();
        // panel.setBackground(Color.black);
        // panel.setBounds(frame.getBounds());
        // tmp.setBounds(frame.getBounds());
        //MapDoor.getMapDoor(DoorType.DOOR_OPEN, new Position(0, 0)), 1);
        // frame.setContentPane(map);
        // GridLayout playerLayout = new GridLayout(10,10);
        // frame.setLayout(null);

        frame.setContentPane(map);
        
        // MapKachel tmp = MapDoor.getMapDoor(DoorType.DOOR_OPEN, new Position(0, 0));

        // JLayeredPane pane = new JLayeredPane();
        // pane.add(tmp, 0);
        // pane.add(map, 1);
        // frame.setContentPane(pane);


        // JPanel panel = new JPanel();
        // panel.add(pane);
        // panel.setVisible(true);
        // frame.setContentPane(panel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        map.addFigur(new Figur(Color.green), new Position(5,5));
        map.addFigur(new Figur(Color.green), new Position(2,2));
        map.addFigur(new Figur(Color.green), new Position(4,4));
        map.addFigur(new Figur(Color.green), new Position(8,8));
        map.addFigur(new Figur(Color.green), new Position(5,9));


        // frame.addComponentListener(new ComponentAdapter() {
        //     @Override
        //     public void componentResized(ComponentEvent e) {
        //         Dimension newSize = e.getComponent().getSize();
                
        //         pane.setPreferredSize(newSize);
        //         for(Component c : pane.getComponents())
        //             c.setSize(newSize);
        //         pane.setSize(newSize);
        //         System.out.println("width: " + pane.getWidth() + "\n" + "height: "+ pane.getHeight());
        //         pane.revalidate();
        //         pane.repaint();
        //     }
        // });


        // JFrame frame = map;
        // Map map = new Map(10, 10);
        // map.setBounds(100, 100, 500, 500);
        //MapDoor.getMapDoor(DoorType.DOOR_OPEN, new Position(0, 0)), 1);
        // frame.setContentPane(map);
        // GridLayout playerLayout = new GridLayout(10,10);
        // frame.setLayout(null);
        // frame.setContentPane(map);
        
        // map.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // map.setVisible(true);
    }

//    static Wizzard wizzard = new Wizzard(1, 1, 1, 1, 1, 1, null, null);

    public static void main(String[] args) {

		new HelloWorld();

    }
}
// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;

// public class HelloWorld extends JFrame {
//     private JPanel[][] panelGrid;
//     private JPanel selectedPanel;
//     private Point selectedPanelLocation;
//     private JPanel mainPanel;

//     public HelloWorld(int rows, int cols) {
//         panelGrid = new JPanel[rows][cols];
//         mainPanel = new JPanel(new GridLayout(rows, cols));
//         // Create the JPanels to drag and drop
//         for (int i = 0; i < rows * cols; i++) {
//             JPanel panel = new JPanel();
//             panel.setBorder(BorderFactory.createLineBorder(Color.black));
//             panel.addMouseListener(new PanelMouseListener());
//             panel.addMouseMotionListener(new PanelMouseMotionListener());
//             mainPanel.add(panel);
//         }

//         // Create the JFrame
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setContentPane(mainPanel);
//         this.pack();
//         this.setVisible(true);
//     }

//     private class PanelMouseListener extends MouseAdapter {
//         @Override
//         public void mousePressed(MouseEvent e) {
//             selectedPanel = (JPanel) e.getSource();
//             selectedPanelLocation = selectedPanel.getLocation();
//         }

//         @Override
//         public void mouseReleased(MouseEvent e) {
//             // Check if the panel is dropped inside the grid
//             Point p = e.getLocationOnScreen();
//             SwingUtilities.convertPointFromScreen(p, e.getComponent());
//             Component component = SwingUtilities.getDeepestComponentAt(
//                     e.getComponent(), p.x, p.y);

//             if (component instanceof JPanel) {
//                 JPanel targetPanel = (JPanel) component;
//                 int row = -1, col = -1;

//                 // Find the row and column of the target panel
//                 for (int i = 0; i < panelGrid.length; i++) {
//                     for (int j = 0; j < panelGrid[i].length; j++) {
//                         if (panelGrid[i][j] == targetPanel) {
//                             row = i;
//                             col = j;
//                             break;
//                         }
//                     }
//                 }

//                 // Move the selected panel to the target panel's location
//                 if (row != -1 && col != -1) {
//                     mainPanel.remove(selectedPanel);
//                     mainPanel.add(selectedPanel, row * panelGrid[0].length + col);
//                     panelGrid[row][col] = selectedPanel;
//                     selectedPanel.setLocation(selectedPanelLocation);
//                     selectedPanel = null;
//                 }
//             } else {
//                 // Move the selected panel back to its original location
//                 selectedPanel.setLocation(selectedPanelLocation);
//                 selectedPanel = null;
//             }
//         }
//     }

//     private class PanelMouseMotionListener extends MouseMotionAdapter {
//         @Override
//         public void mouseDragged(MouseEvent e) {
//             if (selectedPanel != null) {
//                 selectedPanel.setLocation(e.getX(), //+ selectedPanelLocation.x - selectedPanel.getWidth() / 2,
//                         e.getY());// + selectedPanelLocation.y - selectedPanel.getHeight() / 2);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         new HelloWorld(3, 4);
//     }
// }

// import java.awt.AlphaComposite;
// import java.awt.Graphics2D;
// import java.awt.image.BufferedImage;
// import java.io.File;
// import java.io.IOException;
// import java.net.URL;
// //from  ww  w .j a v a  2  s  .c  o  m
// import javax.imageio.ImageIO;
// import javax.swing.ImageIcon;
// import javax.swing.JFrame;
// import javax.swing.JLabel;

// public class HelloWorld {
//   public static void main(String[] args) throws IOException {
//     URL url = new URL("http://www.java2s.com/style/download.png");
//     BufferedImage im = ImageIO.read(url);
//     URL url2 = new URL("http://www.java2s.com/style/download.png");
//     BufferedImage im2 = ImageIO.read(url2);
//     Graphics2D g = im.createGraphics();
//     g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.4f));
//     g.drawImage(im2, (im.getWidth() - im2.getWidth()) / 2,
//         (im.getHeight() - im2.getHeight()) / 2, null);
//     g.dispose();

//     display(im);
//     ImageIO.write(im, "jpeg", new File("output.jpeg"));
//   }

//   public static void display(BufferedImage image) {
//     JFrame f = new JFrame();
//     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     f.getContentPane().add(new JLabel(new ImageIcon(image)));
//     f.pack();
//     f.setVisible(true);
//   }
// }
