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
    int value = 0;
    
    ContainerPanel()
    {
    game = new GamePanel();
    options = new OptionsPanel();
    splashScreen = new SplashPanel();
    
    splashScreen.setBackground(Color.blue);
    game.setBackground(Color.red);
    add(splashScreen);
    
    splashTimer = new Timer(1,this);
    splashTimer.start();
    
    
    }

    public void swapPanel(MyJPanel p1, MyJPanel p2)
    {
        this.remove(p1);
        this.add(p2);
        validate();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object select = e.getSource();
        if (select == splashTimer)
        {
            value++;
          //  splashScreen.test.setText(" " + value);
            if (value == 1000)
            {
                this.swapPanel(splashScreen,game);
            }
        }
    }
}
