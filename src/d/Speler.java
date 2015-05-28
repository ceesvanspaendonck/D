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
    private int[][] grid;
    public Speler(int x, int y, Doolhof doolhof)
    {
        this.x = x;
        this.y = y;
        this.grid = doolhof.grid;
    }

    public void move(String richting)
    {
        int spelerx = 0;
        int spelery = 0;

                    if(richting.equals("up")&&( grid[spelerx][spelery+1]!= 1 ))
                    {
                        System.out.println("Up");
                           //verplaatsspeler
                        spelerx = spelerx ;
                        spelery ++ ;
                    }
                    else if(richting.equals("right")&&( grid[spelerx + 1][spelery]!= 1 ))
                    {
                        System.out.println("Right");
                      spelerx ++ ;
                      spelery =spelery ;
                        //verplaatsspeler
                    }
                    else if(richting.equals("down")&&( grid[spelerx][spelery- 1]!= 1 ))
                    {
                        System.out.println("Down");
                        spelerx =spelerx ;
                        spelery -- ;
                        //verplaatsspeler
                    }
                    else if(richting.equals("left")&&( grid[spelerx-1][spelery]!= 1 ))
                    {
                        System.out.println("Left");
                        spelerx -- ;
                        spelery = spelery ;
                        //verplaatsspeler
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
