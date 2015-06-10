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
    public static int gridX, gridY, stappen;
    public static boolean heeftBazooka;
    public static String lastDirection;
    
    public Speler(int gridX, int gridY)
    {
        this.lastDirection = null;
        this.stappen = 0;
        this.heeftBazooka = false;
        this.gridX = gridX;
        this.gridY = gridY;
    }
    
    public void move(String richting)
    {
        if(richting.equals("up"))
        {
            this.lastDirection = "north";
            if(Doolhof.grid[(this.gridY-1)][this.gridX] == 0 || Doolhof.grid[(this.gridY-1)][this.gridX] == 4|| Doolhof.grid[(this.gridY-1)][this.gridX] == 6)
            {
                if(Doolhof.grid[(gridY-1)][gridX] == 4)
                {
                    this.heeftBazooka = true;
                }
                  if(Doolhof.grid[(this.gridY - 1)][this.gridX] == 6)
                {
                    Doolhof.stappen = Doolhof.stappen + 10;
                }
                Doolhof.grid[gridY][gridX] = 0;
                Doolhof.grid[(gridY - 1)][gridX] = 2;
                this.gridY = this.gridY - 1;
                updatestappen();
            }
            if(Doolhof.grid[(this.gridY - 1)][this.gridX] == 3)
            {
                    System.out.println("hahah vriend");
            }

        }
        else if(richting.equals("right"))
        {
            this.lastDirection = "east";
            if(Doolhof.grid[this.gridY][(this.gridX + 1)] == 0 || Doolhof.grid[this.gridY][(this.gridX + 1)] == 4|| Doolhof.grid[this.gridY][(this.gridX + 1)] == 6)
            {
                if(Doolhof.grid[(this.gridY)][this.gridX + 1] == 4)
                {
                    this.heeftBazooka = true;
                }
                if(Doolhof.grid[(this.gridY)][this.gridX+1] == 6)
                {
                    Doolhof.stappen = Doolhof.stappen + 10;
                }
                Doolhof.grid[gridY][gridX] = 0;
                Doolhof.grid[gridY][(gridX + 1)] = 2;
                this.gridX = this.gridX + 1;
                updatestappen();
            }
            if(Doolhof.grid[(this.gridY)][this.gridX + 1] == 3)
            {
                    System.out.println("hahah vriend");
            }

        }
        else if(richting.equals("down"))
        {
            this.lastDirection = "south";
            if(Doolhof.grid[(this.gridY + 1)][this.gridX] == 0 || Doolhof.grid[(this.gridY + 1)][this.gridX] == 4|| Doolhof.grid[(this.gridY + 1)][this.gridX] == 6)
            {
                if(Doolhof.grid[(this.gridY + 1)][this.gridX] == 4)
                {
                    this.heeftBazooka = true;
                }
                if(Doolhof.grid[(this.gridY + 1)][this.gridX] == 6)
                {
                    Doolhof.stappen = Doolhof.stappen + 10;
                }
                Doolhof.grid[gridY][gridX] = 0;
                Doolhof.grid[(gridY + 1)][gridX] = 2;
                this.gridY = this.gridY + 1;
                updatestappen();
            }
            if(Doolhof.grid[(this.gridY + 1)][this.gridX] == 3)
            {
                    System.out.println("hahah vriend");
            }

        }
        else if(richting.equals("left"))
        {
            this.lastDirection = "west";
            if(Doolhof.grid[this.gridY][(this.gridX - 1)] == 0 || Doolhof.grid[this.gridY][(this.gridX - 1)] == 4|| Doolhof.grid[this.gridY][(this.gridX - 1)] == 6)
            {
                if(Doolhof.grid[(this.gridY)][this.gridX - 1] == 4)
                {
                    this.heeftBazooka = true;
                }
                 if(Doolhof.grid[(this.gridY)][this.gridX - 1] == 6)
                {
                    Doolhof.stappen = Doolhof.stappen + 10;
                }
                Doolhof.grid[gridY][gridX] = 0;
                Doolhof.grid[gridY][(gridX - 1)] = 2;
                this.gridX = this.gridX - 1;
                updatestappen();
            }
            if(Doolhof.grid[(this.gridY)][this.gridX - 1] == 3)
            {
                    System.out.println("hahah vriend");
            }

        }
    }
    
    public static void schiet()
    {
        if(heeftBazooka == true)
        {
            if(lastDirection.equals("north"))
            {
                for (int i = gridY; i >= 0; i--)
                {
                    if(Doolhof.grid[i][gridX] == 1)
                    {
                        Doolhof.grid[i][gridX] = 0;
                        break;                     
                    }
                }
            }
            
            if(lastDirection.equals("east"))
            {
                for (int i = gridX; i < 14; i++)
                {
                    if(Doolhof.grid[gridY][i] == 1)
                    {
                        Doolhof.grid[gridY][i] = 0;
                        break;
                    }
                }
            }
            if(lastDirection.equals("south"))
            {
                for (int i = gridY; i < 15; i++)
                {
                    if(Doolhof.grid[i][gridX] == 1)
                    {
                        Doolhof.grid[i][gridX] = 0;
                        break;                      
                    }
                }
            }
            if(lastDirection.equals("west"))
            {  
                for (int i = gridX; i >= 0; i--)
                {
                    if(Doolhof.grid[gridY][i] == 1)
                    {
                        Doolhof.grid[gridY][i] = 0;
                        break;
                    }
                }
            }
            heeftBazooka = true;
        
        }
    }
    
  @Override
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        for (int i = 0; i < Doolhof.rows; i++)
        {
            for (int j = 0; j < Doolhof.columns; j++)
            {
                if (Doolhof.grid[j][i]==(2))
                {
                    g.setColor(Color.ORANGE);
                    g.fillRect(i*25, j*25, 22, 22);
                }
            }
        repaint();
     }
        
     
}
    public void updatestappen()
    {
        Doolhof.stappen++;

        Spel.stappen.setText("Aantal stappen: " + Doolhof.stappen);   
    }
}