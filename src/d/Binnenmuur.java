
package d;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author max
 */
public class Binnenmuur extends Muur
{


    public boolean isVerwoestbaar() {
       
        return verwoestbaar;
    }
    public static void Teken (Graphics g , int x ,int y){
    g.setColor(Color.RED);
    g.fillRect(x, y, 22, 22);

       
    }
}
