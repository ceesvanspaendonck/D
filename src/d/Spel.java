package d;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;


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
    
    
    
    public static void main(String[] args) throws FileNotFoundException
    {
  
        frame.setVisible(true);
       
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
        Doolhof doolhofP = new Doolhof(15, 15);

    


        stappen = new JLabel("Aantal stappen: " + Doolhof.stappen,SwingConstants.CENTER);
        stappen.setPreferredSize(new Dimension(300, 100));
        stappen.setVisible(true);
        Speler speler = new Speler(1,6);// waarom speler hier dan kan ik hem niet tekenen in drawing met new speler 
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