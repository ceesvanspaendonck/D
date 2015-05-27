package d;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author Max & Cees
 */

public class Doolhof extends JPanel
{
    int rows; //13 (horizontaal)
    int columns; //10 (verticaal
    int [][] grid = {{1,1,1,1,1,1,1,1,1,1,1,1,1},
                    {1,0,1,0,1,0,1,0,0,0,0,0,1},
                    {1,0,1,0,0,0,1,0,1,1,1,0,1},
                    {1,0,0,0,1,1,1,0,0,0,0,0,1},
                    {1,0,1,0,0,0,0,0,1,1,1,0,1},
                    {1,0,1,0,1,1,1,0,1,0,0,0,1},
                    {1,0,1,0,1,0,0,0,1,1,1,0,1},
                    {1,0,1,0,1,1,1,0,1,0,1,0,1},
                    {1,0,0,0,0,0,0,0,0,0,1,0,1},
                    {1,1,1,1,1,1,1,1,1,1,1,1,1}};

    public Doolhof(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;
    }

    @Override
    public void paintComponent (Graphics g){
    {
        super.paintComponent(g);
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                if (grid[j][i]==(1))
                {
                    g.setColor(Color.red);
                    g.fillRect(j*25, i*25, 20, 20);   
                }
            }
        repaint();
    }
}
}
}