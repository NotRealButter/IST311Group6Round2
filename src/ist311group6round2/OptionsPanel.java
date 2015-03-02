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
    
    difficulty = 1;
    
    easy = new JButton("EASY");
    easy.setBounds(100, 100, 100, 100);
    medium = new JButton("MEDIUM");
    medium.setBounds(100, 300, 100, 100);
    hard = new JButton("HARD");
    hard.setBounds(100, 500, 100, 100);
    start = new JButton ("Start the Game");
    start.setBounds(600, 300, 400, 200);
   
    
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
