package ist311group6round2;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Stephen
 */
public class ContainerPanel extends MyJPanel
{

    GamePanel game;
    OptionsPanel options;
    SplashPanel splashScreen;    
    
    ContainerPanel()
    {
    game = new GamePanel();
    options = new OptionsPanel();
    splashScreen = new SplashPanel();
    }
}
