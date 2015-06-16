package d;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author Max & Cees
 */
public class Drawing extends JPanel
{

    
    
    @Override
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        for (int i = 0; i < Doolhof.rows; i++)  //10
        {
            for (int j = 0; j < Doolhof.columns; j++) //13
            {
                if (Doolhof.grid[j][i] == (1) || Doolhof.grid[j][i] == (5)) //1 = muur, 2 = speler, 3 = vriend, 4 = bazooka, 5 = buiten muur
                {
                  Muur muur = new Muur();
                  muur.Teken(g, i*25, j*25);
                }
                if (Doolhof.grid[j][i]==(0))
                {
                  Tegel tegel = new Tegel(i, j);
                  if (tegel.kortstePad==true){
                  tegel.Teken(g,i*25,j*25);
                  }
                  else {
                      tegel.Teken(g, i*25, j*25);
                  }
                  
                  
                 

                }
                if (Doolhof.grid[j][i]==(5))
                {
                  Buitenmuur buitenmuur = new Buitenmuur();
                  buitenmuur.Teken(g,i*25,j*25);
                   

                }
                 if (Doolhof.grid[j][i]==(1))
                {
                  Binnenmuur binnenmuur = new Binnenmuur();
                  binnenmuur.Teken(g,i*25,j*25);
                   

                }
                if (Doolhof.grid[j][i]==(2))
                {
                  
//                  public static void Teken (Graphics g , int x ,int y){
    g.setColor(Color.YELLOW);
    g.fillRect(i*25, j*25, 22, 22);

                }
                if (Doolhof.grid[j][i]==(3))
                {
                    Vriend vriend = new Vriend(10,14);
                    vriend.Teken(g , i*25 , j*25);

                }
                if (Doolhof.grid[j][i]==(6))
                {
                    Valsspeler valsspeler = new Valsspeler(3,11);
                    valsspeler.Teken(g,i*25,j*25);
                }
                if (Doolhof.grid[j][i]==(4))//bazooka
                {
                   Bazooka bazooka = new Bazooka(1,1);
                   bazooka.Teken(g , i*25 , j * 25);
                }
                if (Doolhof.grid[j][i]==(7))
                {
                    Helper helper = new Helper(1,1);
                    helper.Teken(g,i*25,j*25);
                }
            }
        super.repaint();
     }     
}
}
