package d;

import static d.Speler.gridX;
import static d.Speler.gridY;
import static d.Speler.heeftBazooka;
import static d.Speler.lastDirection;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * @author Max & Cees
 */
public class Bazooka extends JPanel
{
    public static int gridX, gridY;
    
    public Bazooka(int gridX, int gridY)
    {
        this.gridX = gridX;
        this.gridY = gridY;
    }
    
        public static void Teken (Graphics g , int x ,int y){
    g.setColor(Color.MAGENTA);
    g.fillRect(x, y, 22, 22);  
    }
        
//  /*      public static void schiet()
//    {
//        if(heeftBazooka == true)
//        {
//            if(lastDirection.equals("north"))
//            {
//                for (int i = gridY; i >= 0; i--)
//                {
//                    if(Doolhof.grid[i][d.Speler.gridX] == 1)
//                    {
//                        Doolhof.grid[i][d.Speler.gridX] = 0;
//                        break;
//                    }
//                }
//            }
//
//            if(lastDirection.equals("east"))
//            {
//                for (int i = gridX; i < 14; i++)
//                {
//                    if(Doolhof.grid[d.Speler.gridY][i] == 1)
//                    {
//                        Doolhof.grid[d.Speler.gridY][i] = 0;
//                        break;
//                    }
//                }
//            }
//            if(lastDirection.equals("south"))
//            {
//                for (int i = gridY; i < 15; i++)
//                {
//                    if(Doolhof.grid[i][d.Speler.gridX] == 1)
//                    {
//                        Doolhof.grid[i][d.Speler.gridX] = 0;
//                        break;
//                    }
//                }
//            }
//            if(lastDirection.equals("west"))
//            {
//                for (int i = gridX; i >= 0; i--)
//                {
//                    if(Doolhof.grid[d.Speler.gridY][i] == 1)
//                    {
//                        Doolhof.grid[d.Speler.gridY][i] = 0;
//                        break;
//                    }
//                }
//            }
//            heeftBazooka = true;
//
//        }
//    }*/
}
