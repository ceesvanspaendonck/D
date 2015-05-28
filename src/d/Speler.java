package d;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author Max & Cees
 */

public class Speler extends JPanel
{
    private int x, y, gridX, gridY;
    private int[][] grid;
    public Speler(int x, int y, Doolhof doolhof)
    {
        this.x = x;
        this.y = y;
        this.gridX = 1;
        this.gridY = 1;
        this.grid = doolhof.grid;
    }

    public void move(String richting)
    {
        if(richting.equals("up"))
        {
            System.out.println("Up");
            System.out.println("Huidige locatie: " + this.gridX + "," + this.gridY + " - Locatie up: " + this.gridX + "," + (this.gridY-1) + " -  Waarde: " + grid[this.gridX][(this.gridY-1)]);
            
            //verplaatsspeler
        }
        else if(richting.equals("right"))
        {
            System.out.println("Right");
            System.out.println("Huidige locatie: " + this.gridX + "," + this.gridY + " - Locatie right: " + (this.gridX + 1) + "," + this.gridY + " -  Waarde: " + grid[(this.gridX+1)][this.gridY]);
            //verplaatsspeler
        }
        else if(richting.equals("down"))
        {
            System.out.println("Down");
            System.out.println("Huidige locatie: " + this.gridX + "," + this.gridY + " - Locatie down: " + this.gridX + "," + (this.gridY + 1) + " -  Waarde: " + grid[this.gridX][(this.gridY+1)]);
            //verplaatsspeler
        }
        else if(richting.equals("left"))
        {
            System.out.println("Left");
            System.out.println("Huidige locatie: " + this.gridX + "," + this.gridY + " - Locatie left: " + (this.gridX - 1) + "," + this.gridY + " -  Waarde: " + grid[(this.gridX-1)][this.gridY]);
            //verplaatsspeler
        }
        
        /*if(richting.equals("up") && (grid[this.gridX][this.gridY - 1] != 1 ))
        {
            System.out.println("Up");
            //verplaatsspeler
        }
        else if(richting.equals("right") && (grid[(this.gridX + 1)][this.gridY] != 1))
        {
            System.out.println("Right");
            //verplaatsspeler
        }
        else if(richting.equals("down") && (grid[this.gridX][(this.gridY - 1)] != 1))
        {
            System.out.println("Down");
            //verplaatsspeler
        }
        else if(richting.equals("left") && (grid[(this.gridX - 1)][this.gridY] != 1))
        {
            System.out.println("Left");
            //verplaatsspeler
        }*/

    }
    
    @Override
    public void paintComponent (Graphics g){
    {
        super.paintComponent(g);
        g.setColor(Color.green);
        g.fillRect(25, 25, 20, 20);
        repaint();
    }
    
}
}
