package ist311group6round2;

import java.awt.*;
import javax.swing.*;

public class Enemy extends Rectangle
{
    Image ghostLeft = Toolkit.getDefaultToolkit().getImage("images/ghostLeft.png");
    Image ghostRight = Toolkit.getDefaultToolkit().getImage("images/ghostRight.png");
    int enX,enY,enSize,enDX,enDY,enMoveSpeed,enDirFac;

    
    Enemy()
    {
        enX = 1100;
        enY = 620;
        enSize = 60;
        enMoveSpeed = 1;
        enDirFac = 2;
        
    }

        public Rectangle getEnShape()
    {
        x = enX;
        y = enY;
        this.setBounds(enX,enY,enSize,enSize);
        return this;
    }
    public void resetRectangle()
    {
        enX = 1100;
        enY = 620;
        this.setBounds(enX,enY,enSize,enSize);

    }
    
    public void enemyMove()
    {
        enX += enDX;
        enY += enDY;

    }
}

