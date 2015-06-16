package d;

import java.awt.Color;
import java.awt.Graphics;
import java.io.*;
import java.util.*;
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
    public static int level ;
    //1 = muur, 2 = speler, 3 = vriend, 4 = bazooka, 5 = buiten muur
    
    public static int[][] grid = new int[15][15];
    
    public Doolhof(int rows, int columns) throws FileNotFoundException
    {
        this.rows = rows;
        this.columns = columns;
        this.stappen = 0;
        vormGrid();
        
    }
    
    public static void vormGrid() throws FileNotFoundException
    {
       
        //java.io.File file = new java.io.File("C:\\Users\\max\\Desktop\\woo\\D\\src\\Doolhoftxt4.txt");
        java.io.File file = new java.io.File("C:/Users/Sony/Documents/NetBeansProjects/D/src/DoolhofTxt4.txt");
        //3 verschillende levels switchen nadat de VRIEND is aangeraakt
        if (level == 1){
             file = new java.io.File("C:\\Users\\max\\Desktop\\woo\\D\\src\\Doolhoftxt5.txt");
        }
         if (level == 2){
             file = new java.io.File("C:\\Users\\max\\Desktop\\woo\\D\\src\\Doolhoftxt4.txt");
        } 
         if (level == 3){
             file = new java.io.File("C:\\Users\\max\\Desktop\\woo\\D\\src\\Doolhoftxt4.txt");
        }

        //java.io.File file = new java.io.File("C:\\Users\\max\\Desktop\\woo\\D\\src\\Doolhoftxt5.txt");
        //java.io.File file = new java.io.File("C:/Users/Sony/Documents/NetBeansProjects/D/src/DoolhofTxt4.txt");
        try
        {
            Scanner input = new Scanner(file);
            
            for (int i = 0; i < 15; i++)
            {
                for (int j = 0; j < 15; j++)
                {
                    grid[i][j] = Integer.parseInt(input.next());
                }
            };
            
        }
        
        catch(FileNotFoundException e)
        {
            System.err.format("Error, geen file\n");
        }
    }
}
