package ist311group6round2;

import java.awt.*;
import javax.swing.*;

public class Treasure extends Rectangle
{
    int x,y,size;
    Image treasure = Toolkit.getDefaultToolkit().getImage("images/treasure.png");
    
    Treasure()
    {
        x = 540;
        y = 370;
        size = 50;
                this.setBounds(x,y,size,size);

    }
    
    public void treasureMove()
    {
        x = (int)(Math.random()*(1180+1));
        y = (int)(Math.random()*(610+1));
        this.setBounds(x,y,size,size);
    }
    
    public Rectangle getTreasureShape()
    {
        this.x = x;
        this.y = y;
        return this;
    }

}
