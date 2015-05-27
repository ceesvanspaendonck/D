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
    int x, y, rows, columns;
    
    public Drawing(Speler speler, Doolhof doolhof, int x, int y, int rows, int columns)
    {
        this.speler = speler;
        this.doolhof = doolhof;
        this.x = x;
        this.y = y;
        this.rows = rows;
        this.columns = columns;
    }
    
    
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        for (int i = 0; i < columns; i++) 
        {
            for (int j = 0; j < rows; j++) 
            {
                if (doolhof.grid[i][j]==(1))
                {
                    g.setColor(Color.red);
                    g.fillRect(i*25, j*25, 20, 20);   
                }
                if (doolhof.grid[i][j]==(2))
                {
                    g.setColor(Color.ORANGE);
                    g.fillRect(i*25, j*25,20,20);
                }
            }
        repaint();
     }
}
}
