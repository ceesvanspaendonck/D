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
        
        Doolhof doolhofP = new Doolhof(13, 10); //eerst rijen (horizontaal), dan kolommen (verticaal)
        Speler speler = new Speler(1, 6, doolhofP); //controleren waarom 14
        
        PressListener listener = new PressListener(speler);
        frame.addKeyListener(listener);
        Drawing drawing = new Drawing(speler, doolhofP, 1, 6, 13, 10);
        frame.add(drawing);
    }
}
