package ist311group6round2;

import java.awt.*;
import javax.swing.*;

public class Enemy extends Rectangle
{
    int enX,enY,enSize,enDX,enDY,enMoveSpeed;
    private Rectangle enShape;
    
    Enemy()
    {
        enX = 1100;
        enY = 620;
        enSize = 60;
        enMoveSpeed = 1;
        enShape = new Rectangle(enX,enY,enSize,enSize);
        
    }

        public Rectangle getRectangle()
    {
        enemyMove();
        enShape.x = enX;
        enShape.y = enY;
        enShape.setBounds(enX,enY,enSize,enSize);
        return enShape;
    }
    public void resetRectangle()
    {
        enX = 1100;
        enY = 620;
        enShape.setBounds(enX,enY,enSize,enSize);

    }
    
    public void enemyMove()
    {
        enX += enDX;
        enY += enDY;

    }
}

