package ist311group6round2;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Stephen
 */
public class OptionsPanel extends JPanel {
    
int difficulty;
JButton easy, medium, hard;

OptionsPanel(){
    easy = new JButton();
    medium = new JButton();
    hard = new JButton();
    
    add(easy);
    add(medium);
    add(hard);
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
