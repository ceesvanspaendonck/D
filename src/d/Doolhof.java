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
    //1 = muur, 2 = speler, 3 = vriend, 4 = bazooka, 5 = buiten muur
//    public static int [][] grid = {
//                            {5,5,5,5,5,5,5,5,5,5,5,5,5},
//                            {5,4,0,0,1,0,0,0,0,0,0,0,5},
//                            {5,0,1,0,1,0,1,0,1,1,1,0,5},
//                            {5,0,1,0,1,0,1,0,0,0,0,0,5},
//                            {5,0,0,0,0,0,1,0,1,1,1,0,5},
//                            {5,0,1,0,1,1,1,0,1,0,0,0,5},
//                            {5,2,1,0,1,0,0,0,1,1,1,0,5},
//                            {5,0,1,0,1,1,1,0,1,0,1,0,5},
//                            {5,0,0,0,0,0,0,0,0,0,1,3,5},
//                            {5,5,5,5,5,5,5,5,5,5,5,5,5}};
//    
    public static int [][] grid;
    
    public Doolhof(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;
        this.stappen = 0;
    }
    
    public static void vormGrid() throws FileNotFoundException
    {
        java.io.File file = new java.io.File("C:/Users/Sony/Documents/NetBeansProjects/D/src/DoolhofTxt.txt");
        try
        {
            Scanner input = new Scanner(file);
            
//            fileIn.nextLine(); // Reads one line from the file
//            fileIn.next(); // Reads one word from the file
//            And, you can check if there is any more text left with:
//
//            fileIn.hasNext(); // Returns true if there is another word in the file
//            fileIn.hasNextLine(); // Returns true if there is another line to read from the file
            
            for (int i = 0; i < 20; i++)
            {
                if(input.next() != null)
                {
                    System.out.println("Null");
                }
                else
                {
                    System.out.println("Niet null");
                }
            }
        }
            
//            
//                for (int i = 0; i < rows; i++)
//                {
//                    for (int j = 0; j < columns; j++)
//                    {
//                        if(input.next() != null)
//                        {
//                            System.out.println("Null");
//                        }
//                        else
//                        {
//                            System.out.println("Niet null");
//                        }
//                    }
//                }
//            }
        
        catch(FileNotFoundException e)
        {
            System.err.format("Error, geen file\n");
        }

//        //Scanner input = new Scanner("d/DoolhofTxt.txt"); //whatever file is being read
//        Scanner in = new Scanner(new FileReader("DoolhofTxt.txt"));
//        
//        for (int i = 0; i < rows; i++)
//        {
//            for (int j = 0; j < columns; j++)
//            {
//                //int nextTile = input.nextInt(); //reads the next int
//                System.out.println(in.nextInt());
//                // or
//                //char nextTile = input.nextChar(); //reads the next char
//            }
//        }
    }
    
    
}
