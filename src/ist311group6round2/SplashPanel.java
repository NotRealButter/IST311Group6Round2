package ist311group6round2;

import java.awt.*;
import javax.swing.*;

public class SplashPanel extends MyJPanel
{
    JLabel test;
    ImageIcon splash = new ImageIcon ("images/splash.jpeg");
        
    SplashPanel()
    {
        test = new JLabel(splash);
        

        add(test);
        
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        
    }
}
