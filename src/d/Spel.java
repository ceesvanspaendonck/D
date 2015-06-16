package d;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.awt.Dimension;


/**
 *
 * @author Max & Cees
 */

public class Spel extends JPanel
{
    public static JLabel stappen;
    static JFrame frame = new JFrame("Best Doolhof Ever");
    static PressListener listener ;
    public JButton startButton = new JButton("Start");
    public JButton pauzeButton = new JButton("Pauze");
    public static JButton opnieuwButton = new JButton("Restart");
    
    static Speler speler = new Speler(1,6);// waarom speler hier dan kan ik hem niet tekenen in drawing met new speler 
    
    public static void main(String[] args) throws FileNotFoundException
    {
  
        frame.setVisible(true);
       
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
        Doolhof doolhofP = new Doolhof(15, 15);

    


        stappen = new JLabel("Aantal stappen: " + Doolhof.stappen,SwingConstants.CENTER);
        stappen.setPreferredSize(new Dimension(300, 100));
        stappen.setVisible(true);
        
        listener = new PressListener( speler);
        frame.addKeyListener(listener);
        frame.getContentPane().add(stappen, BorderLayout.SOUTH);
        Drawing drawing = new Drawing();
        frame.add(drawing);
        frame.setSize(400,600);
   
    }

    public static void restart() throws FileNotFoundException{
        stappen.setText(""); // reset de stappen
    
        Spel.frame.removeKeyListener(listener);
        Spel.frame.dispose();
        Spel.frame.setVisible(false);
        Spel.frame.remove(speler);
      
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Doolhof doolhofP = new Doolhof(15, 15);

        
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