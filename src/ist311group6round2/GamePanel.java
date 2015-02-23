package ist311group6round2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends MyJPanel
{
    PlayerButton player;
    EnemyButton enemy;

    GamePanel()
    {
        
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.blue);
        player = new PlayerButton();
        player.setBounds(player.x, player.y, player.size, player.size);
        add(player);
        
        enemy = new EnemyButton();

        enemy.setBounds(enemy.enX,enemy.enY,enemy.enSize,enemy.enSize);
        add(enemy);
    }
    
    public void gameLogic()
    {
        if (player.x > enemy.enX)
        {
            enemy.enDX = -enemy.enMoveSpeed;
        }
        if (player.x < enemy.enX)
        {
            enemy.enDX = enemy.enMoveSpeed;
        }
        if (player.y > enemy.enY)
        {
            enemy.enDY = -enemy.enMoveSpeed;
        }
        if (player.y < enemy.enY)
        {
            enemy.enDY = enemy.enMoveSpeed;
        }
    }
}
