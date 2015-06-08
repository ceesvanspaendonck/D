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
    //1 = muur, 2 = speler, 3 = vriend, 4 = bazooka, 5 = buiten muur
    public static int [][] grid = {
                            {5,5,5,5,5,5,5,5,5,5,5,5,5},
                            {5,4,0,0,1,0,0,0,0,0,0,0,5},
                            {5,0,1,0,1,0,1,0,1,1,1,0,5},
                            {5,0,1,0,1,0,1,0,0,0,0,0,5},
                            {5,0,0,0,0,0,1,0,1,1,1,0,5},
                            {5,0,1,0,1,1,1,0,1,0,0,0,5},
                            {5,2,1,0,1,0,0,0,1,1,1,0,5},
                            {5,0,1,0,1,1,1,0,1,0,1,0,5},
                            {5,0,0,0,0,0,0,0,0,0,1,3,5},
                            {5,5,5,5,5,5,5,5,5,5,5,5,5}};
    
    public Doolhof(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;
        this.stappen = 0;
    }
    
    
}
