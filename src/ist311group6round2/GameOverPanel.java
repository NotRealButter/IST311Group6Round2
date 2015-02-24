package ist311group6round2;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

/**
 *
 * @author Chelsea
 */
public class GameOverPanel extends MyJPanel
{
    JLabel loser = new JLabel("You lose");
    JButton playagain= new JButton("Play again");
   JButton exit = new JButton("Exit Game");
   Image exitpacman = Toolkit.getDefaultToolkit().getImage("images/GameOver.png");
    public GameOverPanel()
    {
        add(loser);
        add(playagain);
        add(exit);
    }
    
    
}
