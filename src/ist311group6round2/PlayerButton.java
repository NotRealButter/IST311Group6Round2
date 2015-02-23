package ist311group6round2;

import javax.swing.*;

public class PlayerButton extends JButton
{
    int movespeed = 3;
    int playerHealth = 1;
    int directionFacing = 3;
    int dy,dx,x,y,size;
    
    PlayerButton()
    {
        dy = 0;
        dx = 0;
        x = 960;
        y = 540;
        size = 100;
    }
    
    public void playerMove()
    {
        x += dx;
        y += dy;
        setBounds(x,y,size,size);
    }
    
}
