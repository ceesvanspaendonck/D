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
        
        frame.add(speler); //deze komt niet in beeld???? maar als er geen doolhof wordt toegevoegd aan frame wel
        
        Doolhof doolhof = new Doolhof(13, 10); //eerst rijen (horizontaal), dan kolommen (verticaal). grid = 13 x 10
        
        frame.add(doolhof);
    }
}
