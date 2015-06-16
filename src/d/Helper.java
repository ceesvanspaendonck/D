/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
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
    
  public static void solve() throws FileNotFoundException
    {
//        Tegel[][] tegelGrid = new Tegel[15][15];
//        
//        /*for (int i = 0; i < 15; i++)
//        {
//            for (int j = 0; j < 15; j++)
//            {
//                tegelGrid[i][j].solverWaarde = 1000;
//                
//                if(Doolhof.grid[i][j] == 1 || Doolhof.grid[i][j] == 5)
//                {
//                    tegelGrid[i][j].muur = true;
//                }
//                else
//                {
//                    tegelGrid[i][j].muur = false;
//                }
//            }   
//        }*/
//        tegelGrid[1][9].solverWaarde = 99;
//        
//        for (int i = 0; i < 15; i++)
//        {
//            for (int j = 0; j < 15; j++)
//            {
//                System.out.print(tegelGrid[i][j].solverWaarde + " - ");
//            }
//            System.out.println("");
//        }
        
        Tegel testTegel = new Tegel(10, 10);
        Tegel testTegel2 = new Tegel(15, 15);
        testTegel.solverWaarde = 99;
        System.out.println(testTegel.x);
        System.out.println(testTegel2.x);
        testTegel.solverWaarde = 9;
        System.out.println(testTegel.solverWaarde);
        System.out.println(testTegel2.solverWaarde);
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
