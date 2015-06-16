
package d;

import java.awt.Color;
import java.awt.Graphics;
import java.io.FileNotFoundException;

/**
 *
 * @author max
 */
public class Vriend 
{
    public static int X, Y;
    static int[][] grid = new int[15][15];
    
    public Vriend(int X, int Y)
    {
        this.X = X;
        this.Y = Y;
        grid = Doolhof.grid; 
    }
    
   
    
    public static void Teken (Graphics g , int x ,int y){
    g.setColor(Color.BLUE);
    g.fillRect(x, y, 22, 22);}
}
