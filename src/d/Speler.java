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
        this.gridX = 2;
        this.gridY = 2;
        this.grid = doolhof.grid;
    }

    public void move(String richting)
    {
        System.out.println("Huidige coordinaten =  speler.gridX: " + this.gridX + ", speler.gridY: " + this.gridY);
        
        if(richting.equals("up"))
        {
            System.out.println("Coordinaten up = grid[speler.gridX][speler.gridY - 1]: " + grid[this.gridX][this.gridY - 1]);
            //verplaatsspeler
        }
        else if(richting.equals("right"))
        {
            System.out.println("Coordinaten right = grid[speler.gridX][speler.gridY - 1]: " + grid[this.gridX + 1][this.gridY]);
            System.out.println("Right");
            //verplaatsspeler
        }
        else if(richting.equals("down"))
        {
            System.out.println("Coordinaten left = grid[speler.gridX][speler.gridY - 1]: " + grid[this.gridX][this.gridY + 1]);
            System.out.println("Down");
            //verplaatsspeler
        }
        else if(richting.equals("left"))
        {
            System.out.println("Coordinaten down = grid[speler.gridX][speler.gridY - 1]: " + grid[this.gridX - 1][this.gridY]);
            System.out.println("Left");
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
