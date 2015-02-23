package ist311group6round2;

import java.awt.*;

public class GamePanel extends MyJPanel
{
    PlayerButton player;
    GamePanel()
    {
        
        this.setLayout(null);
        player = new PlayerButton();
        player.setBounds(player.x, player.y, WIDTH, WIDTH);
    }
}
