package ist311group6round2;

import java.awt.*;
import javax.swing.*;

public class Treasure extends Rectangle
{
    int x,y,size;
    Image treasure = Toolkit.getDefaultToolkit().getImage("images/treasure.png");
    Rectangle treasureShape;
    
    Treasure()
    {
        x = 540;
        y = 370;
        size = 50;
        treasureShape = new Rectangle(x,y,size,size);        
    }
    
    public void treasureMove()
    {
        x = (int)(Math.random()*(1180+1));
        y = (int)(Math.random()*(610+1));
        treasureShape.setBounds(x,y,size,size);
    }
    
    public Rectangle getTreasureShape()
    {
        treasureShape.x = x;
        treasureShape.y = y;
        return treasureShape;
    }

}
