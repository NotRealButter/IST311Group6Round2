package ist311group6round2;

import java.awt.*;
import javax.swing.*;

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
        GameOverPanel()
    {
        add(loser);
        add(playagain);
        add(exit);
    }
   public void paintComponent(Graphics g)
   {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g; 
        g.drawImage(exitpacman, 0, 0, this);
       
   }

    
    
}
