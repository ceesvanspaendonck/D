/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author max
 */
public class Valsspeler extends JPanel {
      public static int gridX, gridY;
    
    public Valsspeler(int gridX, int gridY)
    {
        this.gridX = gridX;
        this.gridY = gridY;
    }
    
    public static void Teken (Graphics g , int x ,int y){
    g.setColor(Color.DARK_GRAY);
    g.fillRect(x, y, 22, 22);
      
    }
}
