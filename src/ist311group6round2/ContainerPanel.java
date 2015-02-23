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
    Timer splashTimer, gameTime;
    int value = 0;
    WhichKey whichKey;
    
    ContainerPanel()
    {
        game = new GamePanel();
        options = new OptionsPanel();
        splashScreen = new SplashPanel();        
        setFocusable(true);
        whichKey = new WhichKey();

        addKeyListener(whichKey);
        game.setBackground(Color.blue);
        
        options.easy.addActionListener(this);
        options.medium.addActionListener(this);
        options.hard.addActionListener(this);
        options.start.addActionListener(this);


        splashScreen.setBackground(Color.black);
        add(splashScreen);

        splashTimer = new Timer(1,this);
        splashTimer.start();

        gameTime = new Timer(10, this);
    }

    public void swapPanel(MyJPanel p1, MyJPanel p2)
    {
        this.remove(p1);
        this.add(p2);
        repaint();
        validate();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object select = e.getSource();
        if (select == splashTimer)
        {
            value++;
            if (value == 500)
            {
                this.swapPanel(splashScreen,options);
                splashTimer.stop();
            }
           
        }
        if(select == gameTime)
        {
            game.player.playerMove();
            game.gameLogic();
            game.enemy.enemyMove();
        }
        if (select == options.easy)
        {
            options.difficulty = 1;
            game.enemy.enMoveSpeed = options.difficulty;
        }
        if (select == options.medium)
        {
            options.difficulty = 2;
            game.enemy.enMoveSpeed = options.difficulty;

        }
        if (select == options.hard)
        {
            options.difficulty = 3;
            game.enemy.enMoveSpeed = options.difficulty;

        }
        if (select == options.start)
        {
            this.swapPanel(options,game);
            gameTime.start();
        }
    }
    
public class WhichKey implements KeyListener
{

        @Override
        public void keyTyped(KeyEvent e) 
        {
       //no
        }

        @Override
        public void keyPressed(KeyEvent e) 
        {
            int keyCode = e.getKeyCode();
            switch(keyCode)
            {
                case KeyEvent.VK_UP:
                    game.player.dy = -game.player.movespeed;
                    break;
                case KeyEvent.VK_DOWN:
                     game.player.dy = game.player.movespeed;
                    break;
                case KeyEvent.VK_LEFT:
                     game.player.dx = -game.player.movespeed;
                    break;
                case KeyEvent.VK_RIGHT:
                     game.player.dx = game.player.movespeed;
                    break;
                case KeyEvent.VK_SPACE:
                    break;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) 
        {
            int keyCode = e.getKeyCode();
            switch(keyCode)
            {
                case KeyEvent.VK_UP:
                    game.player.dy = 0;
                    break;
                case KeyEvent.VK_DOWN:
                     game.player.dy = 0;
                    break;
                case KeyEvent.VK_LEFT:
                     game.player.dx = 0;
                    break;
                case KeyEvent.VK_RIGHT:
                     game.player.dx = 0;
                    break;
            }        
        }
    
}
}
