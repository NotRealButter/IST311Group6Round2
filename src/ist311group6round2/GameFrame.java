package ist311group6round2;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame
{

    int frameWidth = 1920  , frameHeight = 1080;
    Dimension dim;
    ContainerPanel Overall;
    
        public GameFrame ()
    {
            super ("GAME");
            
            dim = new Dimension(1920,1080);
            Overall = new ContainerPanel();
            add(Overall);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);
            setSize (frameWidth, frameHeight);
            setVisible(true);
    }
}
