package d;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import sun.font.TextLabel;

/**
 *
 * @author Max & Cees
 */

public class Speler extends JPanel
{
    public static int gridX, gridY;
    
    public Speler(int gridX, int gridY)
    {
        this.gridX = gridX;
        this.gridY = gridY;
    }

    public void move(String richting)
    {
        if(richting.equals("up"))
        {
            if(Doolhof.grid[(this.gridY-1)][this.gridX] == 0)
            {
                Doolhof.grid[gridY][gridX] = 0;
                Doolhof.grid[(gridY - 1)][gridX] = 2;
                this.gridY = this.gridY - 1;
                Doolhof.stappen++;
            }
            else
            {
                System.out.println("Foutieve movement.");
            }
        }
        else if(richting.equals("right"))
        {
            if(Doolhof.grid[this.gridY][(this.gridX + 1)] == 0)
            {
                Doolhof.grid[gridY][gridX] = 0;
                Doolhof.grid[gridY][(gridX + 1)] = 2;
                this.gridX = this.gridX + 1;
                Doolhof.stappen++;
                System.out.println(Doolhof.stappen);
            }
            else
            {
                System.out.println("Foutieve movement.");
            }
        }
        else if(richting.equals("down"))
        {
            if(Doolhof.grid[(this.gridY + 1)][this.gridX] == 0)
            {
                Doolhof.grid[gridY][gridX] = 0;
                Doolhof.grid[(gridY + 1)][gridX] = 2;
                this.gridY = this.gridY + 1;
                Doolhof.stappen++;
            }
            else
            {
                System.out.println("Foutieve movement.");
            }
        }
        else if(richting.equals("left"))
        {
            if(Doolhof.grid[this.gridY][(this.gridX - 1)] == 0)
            {
                Doolhof.grid[gridY][gridX] = 0;
                Doolhof.grid[gridY][(gridX - 1)] = 2;
                this.gridX = this.gridX - 1;
                Doolhof.stappen++;
            }
            else
            {
                System.out.println("Foutieve movement.");
            }
        }
    }
}
