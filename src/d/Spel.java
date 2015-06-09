package d;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

/**
 *
 * @author Max & Cees
 */

public class Spel extends JPanel
{
    public static JLabel stappen;
    
    public static void main(String[] args) throws FileNotFoundException
    {
        JFrame frame = new JFrame("Best Doolhof Ever");
        frame.setVisible(true);
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Doolhof doolhofP = new Doolhof(15, 15);
        
        Speler speler = new Speler(1, 6);
        Bazooka bazooka = new Bazooka(1, 1);
        
        stappen = new JLabel("Aantal stappen: " + Doolhof.stappen,SwingConstants.CENTER);
        stappen.setPreferredSize(new Dimension(300, 100));
        stappen.setVisible(true);
        PressListener listener = new PressListener(speler);
        frame.addKeyListener(listener);
        frame.getContentPane().add(stappen, BorderLayout.SOUTH);
        Drawing drawing = new Drawing();
 
        frame.add(drawing);
               frame.setSize(400,600);
    }

}
