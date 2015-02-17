package ist311group6round2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Stephen
 */
public class ContainerPanel extends MyJPanel implements ActionListener
{

    GamePanel game;
    OptionsPanel options;
    SplashPanel splashScreen;    
    Timer splashTimer;
    
    ContainerPanel()
    {
    game = new GamePanel();
    options = new OptionsPanel();
    splashScreen = new SplashPanel();
    
    splashScreen.setBackground(Color.blue);
    game.setBackground(Color.red);
    add(splashScreen);
    
    splashTimer = new Timer(100,this);
    splashTimer.start();
    }

    public void swapPanel()
    {
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object select = e.getSource();
        if (select == splashTimer)
        {
            if(splashTimer.equals(50))
            {
                remove(splashScreen);
                add(game);
            }
        }
    }
}
