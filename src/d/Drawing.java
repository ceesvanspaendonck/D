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
    public Drawing()
    {
    }
    
    
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        for (int i = 0; i < Doolhof.rows; i++)  //10
        {
            for (int j = 0; j < Doolhof.columns; j++) //13
            {
                if (Doolhof.grid[j][i] == (1))
                {
                    g.setColor(Color.red);
                    g.fillRect(i*25, j*25, 24, 24);
                }
                if (Doolhof.grid[j][i]==(2))
                {
                    g.setColor(Color.ORANGE);
                    g.fillRect(i*25, j*25, 22, 22);
                }
            }
        repaint();
     }
        
     
}
}
