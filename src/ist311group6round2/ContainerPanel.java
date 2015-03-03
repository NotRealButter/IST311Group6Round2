package ist311group6round2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Stephen
 */
public class ContainerPanel extends MyJPanel implements ActionListener,ChangeListener
{

    GamePanel game;
    OptionsPanel options;
    SplashPanel splashScreen;    
    GameOverPanel gameOver;
    Timer splashTimer,gameOverTimer;
    int value = 0;
    WhichKey whichKey;
    
    ContainerPanel()
    {
        game = new GamePanel();
        options = new OptionsPanel();
        splashScreen = new SplashPanel();  
        gameOver = new GameOverPanel();
        setFocusable(true);

        
        whichKey = new WhichKey();
        addKeyListener(whichKey);
        game.setBackground(Color.blue);
               
        options.easy.addActionListener(this);
        options.medium.addActionListener(this);
        options.hard.addActionListener(this);
        options.start.addActionListener(this);
        
        gameOver.exit.addActionListener(this);
        gameOver.playagain.addActionListener(this);
        
        game.levelLabel.setText("level: " + options.difficulty);


        splashScreen.setBackground(Color.black);
        add(splashScreen);

        splashTimer = new Timer(1,this);
        splashTimer.start();
        
        gameOverTimer = new Timer (10, this);
        gameOverTimer.start();

 
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
        if (select == gameOverTimer)
        {
            System.out.println("this");
            if(game.gameOver == 1)
            {
                System.out.println("fuck");
                game.enemy.resetRectangle();
                this.swapPanel(game,gameOver);
            }

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
            game.levelLabel.setText("Level: " + options.difficulty);
            game.gameLoop.start();
            game.timeCounter.start();
        }
        if (select == gameOver.exit)
        {
            this.swapPanel(gameOver, options);
        }
        if (select == gameOver.playagain)
        {
            this.swapPanel(gameOver, game);
        }

    }

    @Override
    public void stateChanged(ChangeEvent e)
    {

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
                    game.player.directionFacing = 1;
                    break;
                case KeyEvent.VK_DOWN:
                    game.player.dy = game.player.movespeed;
                    game.player.directionFacing = 3;
                    break;
                case KeyEvent.VK_LEFT:
                    game.player.dx = -game.player.movespeed;
                    game.player.directionFacing = 4;
                    break;
                case KeyEvent.VK_RIGHT:
                    game.player.dx = game.player.movespeed;
                    game.player.directionFacing = 2;
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
