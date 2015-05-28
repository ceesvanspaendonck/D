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
    int rows; //horizontaal, dus 10 onder elkaar
    int columns; //verticaal, dus 13 naast elkaar 
    public int [][] grid = {{1,1,1,1,1,1,1,1,1,1,1,1,1},
                            {1,2,0,0,1,0,1,0,0,0,0,0,1},
                            {1,0,1,0,0,0,1,0,1,1,1,0,1},
                            {1,0,0,0,1,1,1,0,0,0,0,0,1},
                            {1,0,1,0,0,0,0,0,1,1,1,0,1},
                            {1,0,1,0,1,1,1,0,1,0,0,0,1},
                            {1,0,1,0,1,0,0,0,1,1,1,0,1},
                            {1,0,1,0,1,1,1,0,1,0,1,0,1},
                            {1,0,0,0,0,0,0,0,0,0,1,0,1},
                            {1,1,1,1,1,1,1,1,1,1,1,1,1}};
    
    public int [][] grid2 = {{1,1,1,1},
                            {1,2,1,1},
                            {1,1,1,1},
                            {1,1,1,1}};
    

    public Doolhof(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;
    }
}
