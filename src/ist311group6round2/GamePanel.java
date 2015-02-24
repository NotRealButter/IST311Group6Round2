package ist311group6round2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends MyJPanel implements ActionListener
{
    Player player;
    Enemy enemy;
    Timer gameLoop;
    GamePanel()
    {
        
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.blue);
        player = new Player();
        player.setBounds(player.x, player.y, player.size, player.size);
        
        
        enemy = new Enemy();
        enemy.setBounds(enemy.enX,enemy.enY,enemy.enSize,enemy.enSize);
        gameLoop = new Timer(10, this);

    }
    
        public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g; 
        g2d.setColor(Color.red);
        g2d.draw(enemy.getRectangle());
//        g2d.draw(player.getRectangle());
        switch (player.directionFacing)
        {
            case 1: g.drawImage(player.faceUp, player.getRectangle().x, player.getRectangle().y, this);
                    break;
            case 2: g.drawImage(player.faceRight, player.getRectangle().x, player.getRectangle().y, this);
                    break;
            case 3: g.drawImage(player.faceDown,player.getRectangle().x, player.getRectangle().y, this);
                    break;
            case 4: g.drawImage(player.faceLeft,player.getRectangle().x, player.getRectangle().y, this);
                    break;
        }
    }
    
    public void gameLogic()
    {
        if (player.x < enemy.enX)
        {
            enemy.enDX = -enemy.enMoveSpeed;
        }
        if (player.x > enemy.enX)
        {
            enemy.enDX = enemy.enMoveSpeed;
        }
        if (player.y < enemy.enY)
        {
            enemy.enDY = -enemy.enMoveSpeed;
        }
        if (player.y > enemy.enY)
        {
            enemy.enDY = enemy.enMoveSpeed;
        }
        if(enemy.getRectangle().intersects(player.getRectangle()))
        {
            enemy.resetRectangle();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object select = e.getSource();
        if (select == gameLoop)
        {
            player.playerMove();
            gameLogic();
            enemy.enemyMove();
            revalidate();
            repaint();
        }
    }
}
