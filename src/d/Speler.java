package d;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author Max & Cees
 */

public class Speler extends JPanel
{
    private int x, y;
    private int spelerx,spelery;
    private int[][] grid;
    public Speler(int x, int y, Doolhof doolhof)
    {
        this.x = x;
        this.y = y;
        this.grid = doolhof.grid;
    }

    public void move(String richting)
    {
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid.length; j++)
            {
                if(grid[spelerx][spelery] == 0)
                {
                    if(richting.equals("up"))
                    {
                        System.out.println("Up");
                        spelerx = spelerx + ;
                        spelery = spelery + ;
                        //verplaatsspeler
                    }
                    else if(richting.equals("right"))
                    {
                        System.out.println("Right");
                        spelerx = spelerx + ;
                        spelery = spelery + ;
                        //verplaatsspeler
                    }
                    else if(richting.equals("down"))
                    {
                        spelerx = spelerx + ;
                        spelery = spelery + ;
                        System.out.println("Down");
                        //verplaatsspeler
                    }
                    else if(richting.equals("left"))
                    {
                        spelerx = spelerx + ;
                        spelery = spelery + ;
                        System.out.println("Left");
                        //verplaatsspeler
                    }
                }
            }
        }
    }
    
    @Override
    public void paintComponent (Graphics g){
    {
        super.paintComponent(g);
        g.setColor(Color.green);
        g.fillRect(25, 25, 20, 20);
        repaint();
    }
    
}
}
