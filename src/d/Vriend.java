
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
    
    public static void solve() throws FileNotFoundException
    {
        System.out.println("Waarde op " + Y + "," + X + ": " + grid[Y][X]);
        showRichtingen();
        
        
    }
    
    public static void showRichtingen() throws FileNotFoundException
    {
        System.out.println("Noord: " + north(Y, X));
        System.out.println("Oost: " + east(Y, X));
        System.out.println("Zuid: " + south(Y, X));
        System.out.println("West: " + west(Y, X));
         //hier moet dan het schrijven anar de database met Doolhof.level als level een vante vooren opgegeven naam ala naam en Doolhof.stappen als score 
        Doolhof.level++;
        Spel.restart();
         
    }
    
    public static boolean north(int Ytemp, int Xtemp)
    {
        if(grid[(Ytemp - 1)][Xtemp] != 1 && grid[(Ytemp - 1)][Xtemp] != 5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean east(int Ytemp, int Xtemp)
    {
        if(grid[Ytemp][(Xtemp + 1)] != 1 && grid[Ytemp][(Xtemp + 1)] != 5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean south(int Ytemp, int Xtemp)
    {
        if(grid[(Ytemp + 1)][Xtemp] != 1 && grid[(Ytemp + 1)][Xtemp] != 5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean west(int Ytemp, int Xtemp)
    {
        if(grid[Ytemp][(Xtemp - 1)] != 1 && grid[Ytemp][(Xtemp - 1)] != 5)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void Teken (Graphics g , int x ,int y){
    g.setColor(Color.BLUE);
    g.fillRect(x, y, 22, 22);}
}
