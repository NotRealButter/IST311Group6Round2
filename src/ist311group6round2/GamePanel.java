package ist311group6round2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends MyJPanel implements ActionListener
{
    Player player;
    Enemy enemy;
    Treasure treasure;
    OptionsPanel options;
    
    
    Timer gameLoop;
    
    JLabel scoreLabel;
    JLabel levelLabel;
    JLabel timerLabel;
    
    int score = 0;
    GamePanel()
    {
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.blue);
        
        player = new Player();
        player.setBounds(player.x, player.y, player.size, player.size);
        
        enemy = new Enemy();
        enemy.setBounds(enemy.getEnShape());
        
        treasure = new Treasure();
        treasure.setBounds(treasure.treasureShape);
        
        gameLoop = new Timer(10, this);
        
        scoreLabel = new JLabel("score: " + score);
        scoreLabel.setOpaque(true);
        scoreLabel.setBounds(100, 20, 100, 50);
        scoreLabel.setBackground(Color.white);
        add(scoreLabel);
        
        levelLabel = new JLabel("level: ");
        levelLabel.setOpaque(true);
        levelLabel.setBounds(500, 20, 50, 50);
        levelLabel.setBackground(Color.white);
        add(levelLabel);
        
        timerLabel = new JLabel("timer: ");
        timerLabel.setOpaque(true);
        timerLabel.setBounds(900, 20, 50, 50);
        timerLabel.setBackground(Color.white);
        add(timerLabel);
    }
    
        public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g; 
        g2d.setColor(Color.red);
        g2d.draw(enemy.getEnShape());
        g2d.draw(treasure.getTreasureShape());
//        g2d.draw(player.getRectangle());
        switch (player.directionFacing)
        {
            case 1: g.drawImage(player.faceUp, player.getPlayerShape().x, player.getPlayerShape().y, this);
                    break;
            case 2: g.drawImage(player.faceRight, player.getPlayerShape().x, player.getPlayerShape().y, this);
                    break;
            case 3: g.drawImage(player.faceDown,player.getPlayerShape().x, player.getPlayerShape().y, this);
                    break;
            case 4: g.drawImage(player.faceLeft,player.getPlayerShape().x, player.getPlayerShape().y, this);
                    break;
        }
        switch (enemy.enDirFac)
        {
            case 2:    g.drawImage(enemy.ghostLeft,enemy.getEnShape().x, enemy.getEnShape().y, this);
                        break;
            case 1:     g.drawImage(enemy.ghostRight,enemy.getEnShape().x, enemy.getEnShape().y, this);
                        break;
        }
    }
    
    public void gameLogic()
    {
        if (player.x < enemy.enX)
        {
            enemy.enDX = -enemy.enMoveSpeed;
            enemy.enDirFac = 2;
        }
        if (player.x > enemy.enX)
        {
            enemy.enDX = enemy.enMoveSpeed;
            enemy.enDirFac = 1;
        }
        if (player.y < enemy.enY)
        {
            enemy.enDY = -enemy.enMoveSpeed;
        }
        if (player.y > enemy.enY)
        {
            enemy.enDY = enemy.enMoveSpeed;
        }
        if(enemy.getEnShape().intersects(player.getPlayerShape()))
        {
            enemy.resetRectangle();
        }
        if(player.getPlayerShape().intersects(treasure.getTreasureShape()))
        {
            treasure.treasureMove();
            score++;
            scoreLabel.setText("score: " + score);
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
