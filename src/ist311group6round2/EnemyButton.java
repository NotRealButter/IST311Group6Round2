package ist311group6round2;

import javax.swing.*;

public class EnemyButton extends JButton
{
    int enX,enY,enSize,enDX,enDY,enMoveSpeed;
    
    EnemyButton()
    {
        enX = 1700;
        enY = 900;
        enSize = 100;
    }

    public void enemyMove()
    {
        enX += enDX;
        enY += enDY;
        setBounds(enX,enY,enSize,enSize);
    }
}

