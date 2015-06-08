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
    public static int rows; //horizontaal, dus 10 onder elkaar
    public static int columns; //verticaal, dus 13 naast elkaar 
    public static int stappen;
    public static int [][] grid = {
                            {1,1,1,1,1,1,1,1,1,1,1,1,1},
                            {1,4,0,0,1,0,0,0,0,0,0,0,1},
                            {1,0,1,0,1,0,1,0,1,1,1,0,1},
                            {1,0,1,0,1,0,1,0,0,0,0,0,1},
                            {1,0,0,0,0,0,1,0,1,1,1,0,1},
                            {1,0,1,0,1,1,1,0,1,0,0,0,1},
                            {1,2,1,0,1,0,0,0,1,1,1,0,1},
                            {1,0,1,0,1,1,1,0,1,0,1,0,1},
                            {1,0,0,0,0,0,0,0,0,0,1,3,1},
                            {1,1,1,1,1,1,1,1,1,1,1,1,1}};
    
    public Doolhof(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;
        this.stappen = 0;
    }
    
    
}
