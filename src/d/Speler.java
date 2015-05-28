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
    private int gridX, gridY;
    private int[][] grid;
    public Speler(int gridX, int gridY, Doolhof doolhof)
    {
        this.gridX = gridX;
        this.gridY = gridY;
        this.grid = doolhof.grid;
    }

    public void move(String richting)
    {
        System.out.println(this.gridX + "," + this.gridY);
        if(richting.equals("up"))
        {
            if(grid[(this.gridY-1)][this.gridX] == 0)
            {
                //Spel.doolhofP.grid[gridX][gridY] = 0; //FOUT hij verandert doolhof attri van speler maar niet doolhof object wat we gebruiken
                //Spel.doolhofP.grid[gridX][gridY - 1] = 2;
                this.gridY = this.gridY - 1;
            }
        }
        else if(richting.equals("right"))
        {
            if(grid[this.gridY][(this.gridX + 1)] == 0)
            {
                //Spel.doolhofP.grid[gridX][gridY] = 0;
                //Spel.doolhofP.grid[gridX + 1][gridY] = 2;
                this.gridX = this.gridX + 1;
            }
        }
        else if(richting.equals("down"))
        {
            if(grid[(this.gridY + 1)][this.gridX] == 0)
            {
                //Spel.doolhofP.grid[gridX][gridY] = 0;
                //Spel.doolhofP.grid[gridX][gridY + 1] = 2;
                this.gridY = this.gridY + 1;
            }
        }
        else if(richting.equals("left"))
        {
            if(grid[this.gridY][(this.gridX-1)] == 0)
            {
                //Spel.doolhofP.grid[gridX][gridY] = 0;
                //Spel.doolhofP.grid[gridX - 1][gridY] = 2;
                this.gridX = this.gridX - 1;
            }
        }
    }
}
