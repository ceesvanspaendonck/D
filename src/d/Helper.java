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
    public static boolean verandering = true;
    static Tegel[][] tegelGrid;
    //public static Tegel[][] tegelGrid ;// deze is static waardoor je er bij kan in andere dingen zoals solve 
    public Helper(int X, int Y)
    {
        this.X = X;
        this.Y = Y;
        grid = Doolhof.grid; 
    }
    
    public static void solve() throws FileNotFoundException
    {
      tegelGrid = new Tegel[15][15];
          
        for (int i = 0; i < 15; i++)
        {
            for (int j = 0; j < 15; j++)
            {
                Tegel tegel = new Tegel(i, j);
                tegelGrid[i][j] = tegel;
                tegelGrid[i][j].solverWaarde = 1000;
                
                if(Doolhof.grid[i][j] == 1 || Doolhof.grid[i][j] == 5)
                {
                    tegelGrid[i][j].muur = true;
                }
                else
                {
                    tegelGrid[i][j].muur = false;
                }
            }           
        }
   
        tegelGrid[Y][X].solverWaarde = 0;

    } 
public static void test(){
      for (int i = 0; i < 1000; i++)
        {
            vindRoute(tegelGrid);
        }
                    {
          maakRoute(tegelGrid);
}
}
    public static void vindRoute(Tegel [][] tegelGrid)
    {   
        for (int i = 1; i < 14; i++)
        {
            for (int j = 1; j < 14; j++)
            {
                if((tegelGrid[(i - 1)][j].solverWaarde + 1) > tegelGrid[i][j].solverWaarde)
                {
                    if(tegelGrid[(i - 1)][j].muur == false)
                    {
                        tegelGrid[(i - 1)][j].solverWaarde = tegelGrid[i][j].solverWaarde + 1;
                        verandering = true;
                    }
                }
                else
                {
                    verandering = false;
                }
                if((tegelGrid[(i + 1)][j].solverWaarde + 1) > tegelGrid[i][j].solverWaarde)
                {
                    if(tegelGrid[(i + 1)][j].muur == false)
                    {
                        tegelGrid[(i + 1)][j].solverWaarde = tegelGrid[i][j].solverWaarde + 1;
                        verandering = true;
                    }
                }
                else
                {
                    verandering = false;
                }
                if((tegelGrid[i][(j - 1)].solverWaarde + 1) > tegelGrid[i][j].solverWaarde)
                {
                    if(tegelGrid[(i)][(j - 1)].muur == false)
                    {
                        tegelGrid[(i)][(j - 1)].solverWaarde = tegelGrid[i][j].solverWaarde + 1;
                        verandering = true;
                    }
                }
                else
                {
                    verandering = false;
                }
                if((tegelGrid[i][(j + 1)].solverWaarde + 1) > tegelGrid[i][j].solverWaarde)
                {
                    if(tegelGrid[i][(j + 1)].muur == false)
                    {
                        tegelGrid[i][(j + 1)].solverWaarde = tegelGrid[i][j].solverWaarde + 1;
                        verandering = true;
                    }
                }
                else
                {
                    verandering = false;
                }
            }
        }
    }
    
    public static void maakRoute(Tegel [][] tegelGrid)
    {
        int solverWaardeVriend = tegelGrid[(Vriend.Y - 1)][(Vriend.X - 1)].solverWaarde;
        int solverWaardeVriend2 = solverWaardeVriend;
        tegelGrid[(Vriend.Y - 1)][(Vriend.X - 1)].kortstePad = true;
        for (int i = 0; i < solverWaardeVriend2; i++)
        {
            checkOnderdeelRoute(tegelGrid, solverWaardeVriend);
            solverWaardeVriend--;
        }
        
        for (int i = 0; i < 15; i++)
        {
            for (int j = 0; j < 15; j++)
            {
                System.out.print(tegelGrid[i][j].kortstePad + " \t ");
            }
            System.out.println("");
        }
        
    }
    
    public static void checkOnderdeelRoute(Tegel [][] tegelGrid, int solverWaardeVriend)
    {
        for (int i = 1; i < 14; i++)
        {
            for (int j = 1; j < 14; j++)
            {
                if(tegelGrid[i][j].kortstePad == true)
                {
                    if(tegelGrid[(i - 1)][j].solverWaarde == (tegelGrid[i][j].solverWaarde - 1)) //solverWaardeVriend - 2
                    {
                        tegelGrid[(i - 1)][j].kortstePad = true;
                        
                    }
                    else
                    {
                        verandering = false;
                    }
                    if(tegelGrid[(i + 1)][j].solverWaarde == (tegelGrid[i][j].solverWaarde - 1))
                    {
                        tegelGrid[(i + 1)][j].kortstePad = true;
                        
                    }
                    else
                    {
                        verandering = false;
                    }
                    if(tegelGrid[i][(j - 1)].solverWaarde == (tegelGrid[i][j].solverWaarde - 1))
                    {
                        tegelGrid[i][(j - 1)].kortstePad = true;
                    }
                    else
                    {
                        verandering = false;
                    }
                    if(tegelGrid[i][(j + 1)].solverWaarde == (tegelGrid[i][j].solverWaarde - 1))
                    {
                        tegelGrid[i][(j + 1)].kortstePad = true;
                    }
                    else
                    {
                        verandering = false;
                    }
                }
            }
        }
        
    }
   
    public static void Teken (Graphics g , int x ,int y){
    g.setColor(Color.green);
    g.fillRect(x, y, 22, 22);}
    
}
