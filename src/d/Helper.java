/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d;

import java.awt.Color;
import java.awt.Graphics;
import java.io.FileNotFoundException;

/**
 *
 * @author max
 */
public class Helper {
    
    public static int X, Y;
    static int[][] grid = new int[15][15];
    
    public Helper(int X, int Y)
    {
        this.X = X;
        this.Y = Y;
        grid = Doolhof.grid; 
    }
//    Object[][] obj = new Object[ROWS][COLS];
//     for(int i = 0 ; i < ROWS ; i++) 
   // {
//       for(int j = 0 ; i < COLS; j++) 
    //{
//        obj[i][j] = buildNewItem(someValue);
//    }
//}
  public static void solve() throws FileNotFoundException
    {
        Tegel[][] tegelGrid = new Tegel[15][15];
          
        for (int i = 0; i < 15; i++)
        {
            for (int j = 0; j < 15; j++)
            {
                Tegel tegel = new Tegel(i, j);
                tegelGrid[i][j] = tegel;
                tegelGrid[i][j].solverWaarde = 7000;
                
                if(Doolhof.grid[i][j] == 1 || Doolhof.grid[i][j] == 5)
                {
                    tegelGrid[i][j].muur = true;
                }
                else
                {
                    tegelGrid[i][j].muur = false;
                }
                if(i == X && j == X)
                {
                    tegelGrid[Y][X].solverWaarde = 0;
                }
            }   
        
        
        }
      
        //tegelGrid[1][1].solverWaarde=1;
        for (int i = 0; i < 15; i++)
        {
            for (int j = 0; j < 15; j++)
            {
                System.out.print(tegelGrid[i][j].solverWaarde + " - ");
            }
            System.out.println("");
        }
        


 
  } 

    public static void showRichtingen() throws FileNotFoundException
    {
        System.out.println("Noord: " + north(Y, X));
        System.out.println("Oost: " + east(Y, X));
        System.out.println("Zuid: " + south(Y, X));
        System.out.println("West: " + west(Y, X));
        
        
    }
    
    
    //
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
    g.setColor(Color.green);
    g.fillRect(x, y, 22, 22);}
    
}
