package d;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Max & Cees
 */

public class Spel extends JPanel
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Doolhof");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Speler speler = new Speler(10, 14);
        
        frame.add(speler);
        
        Doolhof doolhof = new Doolhof(10, 13);
        
        frame.add(doolhof);
    }
}
