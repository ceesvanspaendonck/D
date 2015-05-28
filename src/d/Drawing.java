package d;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author Max & Cees
 */
public class Drawing extends JPanel
{
    private Speler speler;
    private Doolhof doolhof;
    int gridX, gridY, rows, columns;
    
    public Drawing(Speler speler, Doolhof doolhof, int gridX, int gridY, int rows, int columns)
    {
        this.speler = speler;
        this.doolhof = doolhof;
        this.gridX = gridX;
        this.gridY = gridY;
        this.rows = rows;
        this.columns = columns;
    }
    
    
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        for (int i = 0; i < rows; i++)  //10
        {
            for (int j = 0; j < columns; j++) //13
            {
                if (doolhof.grid[j][i] == (1))
                {
                    g.setColor(Color.red);
                    g.fillRect(i*25, j*25, 24, 24);
                }
                if (doolhof.grid[j][i]==(2))
                {
                    g.setColor(Color.ORANGE);
                    g.fillRect(i*25, j*25, 22, 22);
                }
            }
        repaint();
     }
        
     
}
}
