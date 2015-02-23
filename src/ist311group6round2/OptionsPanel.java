package ist311group6round2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OptionsPanel extends MyJPanel
{
    
int difficulty;
JButton easy, medium, hard,start;

OptionsPanel(){
    setLayout(null);
    setBackground(Color.black);
    
    easy = new JButton("EASY");
    easy.setBounds(100, 200, 100, 100);
    medium = new JButton("MEDIUM");
    medium.setBounds(100, 400, 100, 100);
    hard = new JButton("HARD");
    hard.setBounds(100, 600, 100, 100);
    start = new JButton ("Start the Game");
    start.setBounds(960, 540, 400, 200);
    
    add(easy);
    add(medium);
    add(hard);
    add(start);
}

public class ButtonListener implements ActionListener
{

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            Object select = e.getSource();
            if (select == easy)
            {
                difficulty = 1;
            }
            if (select == medium)
            {
                difficulty = 2;
            }
            if (select == hard)
            {
                difficulty = 3;
            }
        }


}
}
