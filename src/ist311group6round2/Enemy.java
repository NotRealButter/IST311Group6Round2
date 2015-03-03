package ist311group6round2;

import java.awt.*;
import javax.swing.*;

public class Enemy extends Rectangle
{
    Image ghostLeft = Toolkit.getDefaultToolkit().getImage("images/ghostLeft.png");
    Image ghostRight = Toolkit.getDefaultToolkit().getImage("images/ghostRight.png");
    int enX,enY,enSize,enDX,enDY,enMoveSpeed,enDirFac;
    Rectangle enShape;
    
    Enemy()
    {
        enX = 1100;
        enY = 620;
        enSize = 60;
        enMoveSpeed = 1;
        enShape = new Rectangle(enX,enY,enSize,enSize);
        enDirFac = 2;
        
    }

        public Rectangle getEnShape()
    {
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

