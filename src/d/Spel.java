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
        JFrame frame = new JFrame("Doolhof YO");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Doolhof doolhofP = new Doolhof(13, 10); //eerst rijen (horizontaal), dan kolommen (verticaal)
        
        Speler speler = new Speler(1, 6);
        
        //JLabel stappen = new JLabel("Aantal stappen: " + Doolhof.stappen); //toevoegen onderaan scherm moet nog gebeuren
        //stappen.setPreferredSize(new Dimension(300, 100));
        
        PressListener listener = new PressListener(speler);
        frame.addKeyListener(listener);
        Drawing drawing = new Drawing();
        frame.add(drawing);
    }
}
