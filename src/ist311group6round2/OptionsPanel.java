package ist311group6round2;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Stephen
 */
public class OptionsPanel {
int difficulty;
JButton Easy, Medium, Hard;

OptionsPanel(){
    Easy = new JButton();
    Medium = new JButton();
    Hard = new JButton();
   this.add(Easy);
}
}
