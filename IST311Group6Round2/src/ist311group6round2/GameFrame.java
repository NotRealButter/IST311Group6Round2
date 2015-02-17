package ist311group6round2;

import javax.swing.*;

public class GameFrame extends JFrame
{

    int frameWidth = 1005  , frameHeight = 730;
    
        public GameFrame ()
    {
            super ("GAME");
            
            
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);
            setSize (frameWidth, frameHeight);
            setVisible(true);
    }
}
