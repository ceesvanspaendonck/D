package d;

/*
 * @author: Max & Cees
 */

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;


public class PressListener implements KeyListener
{
    private Speler speler;
    
    public PressListener(Speler speler)
    {
        this.speler=speler;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke)
    {
        int key = ke.getKeyCode();
        if (key == KeyEvent.VK_UP) {
            speler.move("up");
        }
        if (key == KeyEvent.VK_DOWN) {
            speler.move("down");
        }
        if (key == KeyEvent.VK_LEFT) {
            speler.move("left");
        }
        if (key == KeyEvent.VK_RIGHT) {
            speler.move("right");
        }
        if (key == KeyEvent.VK_SPACE)
        {
            speler.schiet();
        }
        if (key == KeyEvent.VK_R)
        {

        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
}
