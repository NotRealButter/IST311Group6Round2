package ist311group6round2;

import java.awt.*;
import javax.swing.*;

public class Player extends Rectangle
{
    Image faceRight = Toolkit.getDefaultToolkit().getImage("images/faceRight.png");
    Image faceUp = Toolkit.getDefaultToolkit().getImage("images/faceUp.png");
    Image faceDown = Toolkit.getDefaultToolkit().getImage("images/faceDown.png");
    Image faceLeft = Toolkit.getDefaultToolkit().getImage("images/faceLeft.png");
    int movespeed = 5;
    int directionFacing = 2;
    int dy,dx,x,y,size;
    private Rectangle playerShape;
    
    Player()
    {
        dy = 0;
        dx = 0;
        x = 100;
        y = 100;
        size = 100;
        playerShape = new Rectangle(x,y,size,size);
    }
    
    public void playerMove()
    {
        x += dx;
        y += dy;
        playerShape.setBounds(x,y,size,size);
    }
    
    public Rectangle getPlayerShape()
    {
        playerShape.x = x;
        playerShape.y = y;
        return playerShape;
    }
    
}
