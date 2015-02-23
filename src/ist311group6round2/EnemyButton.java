package ist311group6round2;

import javax.swing.*;

public class EnemyButton extends JButton
{
    int enX,enY,enSize,enDX,enDY,enMoveSpeed;
    
    EnemyButton()
    {
        enX = 1100;
        enY = 620;
        enSize = 60;
        enMoveSpeed = 1;
    }

    public void enemyMove()
    {
        enX += enDX;
        enY += enDY;
        setBounds(enX,enY,enSize,enSize);
    }
}

