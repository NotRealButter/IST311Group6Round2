package ist311group6round2;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame
{

    int frameWidth = 1280  , frameHeight = 720;
    Dimension dim;
    ContainerPanel Overall;
    
        public GameFrame ()
    {
            super ("GAME");
            
            dim = new Dimension(frameWidth,frameHeight);
            Overall = new ContainerPanel();
            add(Overall);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);
            setSize (frameWidth, frameHeight);
            setVisible(true);
    }
}
