package ist311group6round2;

import java.awt.*;
import javax.swing.*;

public class Player extends Rectangle
{
    int movespeed = 3;
    int directionFacing = 3;
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
    
    public Rectangle getRectangle()
    {
        playerShape.x = x;
        playerShape.y = y;
        return playerShape;
    }
    
}
