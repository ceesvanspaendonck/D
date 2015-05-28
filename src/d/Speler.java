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
            if(grid[(this.gridY-1)][this.gridX] == 0)
            {
                //verplaats
            }
            
            //verplaatsspeler
        }
        else if(richting.equals("right"))
        {
            if(grid[this.gridY][(this.gridX+1)] == 0)
            {
                //verplaatsspeler
            }
        }
        else if(richting.equals("down"))
        {
            if(grid[(this.gridY + 1)][this.gridX] == 0)
            {
                //verplaatsspeler
            }
        }
        else if(richting.equals("left"))
        {
            if(grid[this.gridY][(this.gridX-1)] == 0)
            {
                //verplaatsspeler
            }
        }
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
