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
        int stappen = 0;
        this.gridX = gridX;
        this.gridY = gridY;
    }
      //doolhof hehehe= newdoolhof();
    public void move(String richting)
    {
        if(richting.equals("up"))
        {
            if(Doolhof.grid[(this.gridY-1)][this.gridX] == 0)
            {
                Doolhof.grid[gridY][gridX] = 0;
                Doolhof.grid[(gridY - 1)][gridX] = 2;
                this.gridY = this.gridY - 1;
                updatestappen();
            }

        }
        else if(richting.equals("right"))
        {
            if(Doolhof.grid[this.gridY][(this.gridX + 1)] == 0)
            {
                Doolhof.grid[gridY][gridX] = 0;
                Doolhof.grid[gridY][(gridX + 1)] = 2;
                this.gridX = this.gridX + 1;
                updatestappen();

            }

        }
        else if(richting.equals("down"))
        {
            if(Doolhof.grid[(this.gridY + 1)][this.gridX] == 0)
            {
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
            if(Doolhof.grid[this.gridY][(this.gridX - 1)] == 0)
            {
                Doolhof.grid[gridY][gridX] = 0;
                Doolhof.grid[gridY][(gridX - 1)] = 2;
                this.gridX = this.gridX - 1;
                updatestappen();
            }

        }
    }
    
  @Override
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        for (int i = 0; i < Doolhof.rows; i++)  //10
        {
            for (int j = 0; j < Doolhof.columns; j++) //13
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
        public void updatestappen(){
        Doolhof.stappen++;
        Spel.stappen.setText("Aantal stappen: " + Doolhof.stappen);
    }
}

