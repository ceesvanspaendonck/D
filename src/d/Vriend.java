
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
        System.out.println("Noord: " + north());
        System.out.println("Oost: " + east());
        System.out.println("Zuid: " + south());
        System.out.println("West: " + west());
    }
    
    public static boolean north()
    {
        if(grid[(Y - 1)][X] != 1 && grid[(Y - 1)][X] != 5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean east()
    {
        if(grid[Y][(X + 1)] != 1 && grid[Y][(X + 1)] != 5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean south()
    {
        if(grid[(Y + 1)][X] != 1 && grid[(Y + 1)][X] != 5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean west()
    {
        if(grid[Y][(X - 1)] != 1 && grid[Y][(X - 1)] != 5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
