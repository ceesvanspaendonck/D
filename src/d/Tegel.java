/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author max
 */
public class Tegel extends Drawing {

    /**
     *
     */
    public   int solverWaarde = 1000;
    public boolean muur = false;
    public  boolean kortstePad = false;
    public  int y;
    public  int x; 
    
    public Tegel(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.muur = false;
        this.solverWaarde = 1000;
        this.kortstePad = false;
    }

 
    public  void Teken (Graphics g , int x ,int y)
    {
         
        if(this.kortstePad == true)
        {
            System.out.println("true");
              g.setColor(Color.PINK);
            g.fillRect(x, y, 5, 5);
        }
        else
        {
           
            g.setColor(Color.WHITE);
            g.fillRect(x, y, 25, 25);
        }
    }


}
