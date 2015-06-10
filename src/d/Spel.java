package d;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;

/**
 *
 * @author Max & Cees
 */

public class Spel extends JPanel
{
    public static JLabel stappen;
    static JFrame frame = new JFrame("Best Doolhof Ever");
    static PressListener listener ;
    
    
    
    public static void main(String[] args) throws FileNotFoundException
    {
        Speler speler = new Speler(1, 6);
        Bazooka bazooka = new Bazooka(1, 1);  
        frame.setVisible(true);
       
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
        Doolhof doolhofP = new Doolhof(15, 15);
        Vriend vriend = new Vriend(1, 4);

        
        stappen = new JLabel("Aantal stappen: " + Doolhof.stappen,SwingConstants.CENTER);
        stappen.setPreferredSize(new Dimension(300, 100));
        stappen.setVisible(true);
        listener = new PressListener(speler);
        frame.addKeyListener(listener);
        frame.getContentPane().add(stappen, BorderLayout.SOUTH);
        Drawing drawing = new Drawing();
        //speler.move("right");
        frame.add(drawing);
        frame.setSize(400,600);
   
    }


    public static void restart() throws FileNotFoundException{
        stappen.setText(""); // reset de stappen
    
        Spel.frame.removeKeyListener(listener);
        Spel.frame.dispose();
        Spel.frame.setVisible(false);
      
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Doolhof doolhofP = new Doolhof(15, 15);
        
        Speler speler = new Speler(1, 6);
        Bazooka bazooka = new Bazooka(1, 1);
        
        stappen = new JLabel("Aantal stappen: " + Doolhof.stappen,SwingConstants.CENTER);
        stappen.setPreferredSize(new Dimension(300, 100));
        stappen.setVisible(true);
        
        frame.addKeyListener(listener);
        frame.getContentPane().add(stappen, BorderLayout.SOUTH);
        Drawing drawing = new Drawing();
       // speler.move("right");
        frame.add(drawing);
        frame.setSize(400,600);
       
    }
}