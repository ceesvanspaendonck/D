
package d;

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
    
    public static void solve()
    {
        System.out.println("Waarde op " + Y + "," + X + ": " + grid[Y][X]);
        showRichtingen();
        
        
    }
    
    public static void showRichtingen()
    {
        System.out.println("Noord: " + north(Y, X));
        System.out.println("Oost: " + east(Y, X));
        System.out.println("Zuid: " + south(Y, X));
        System.out.println("West: " + west(Y, X));
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
}
