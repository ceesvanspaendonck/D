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
        Doolhof doolhof = new Doolhof(13, 10); //eerst rijen (horizontaal), dan kolommen (verticaal). grid = 13 x 10
        
        Drawing drawing = new Drawing(speler, doolhof, 13, 10, 13, 10);
        frame.add(drawing);
    }
}
