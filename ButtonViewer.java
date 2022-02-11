import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write a description of class ButtonViewer here.
 *
 * @author mrcallaghan
 * @version 10feb2022
 */
public class ButtonViewer
{
    private final int FRAME_WIDTH = 400;
    private final int FRAME_HEIGHT = 100;

    private JFrame frame;
    private JPanel panel;
    private JButton buttonA;
    private JButton buttonB;
    private JLabel label;
    
    private int clickCountA;
    private int clickCountB;

    public ButtonViewer()
    {
        this.clickCountA = 0;
        this.clickCountB = 0;
        
        // 1. define and setup the UI components
        this.frame = new JFrame();
        this.panel = new JPanel();

        this.buttonA = new JButton("Click me!");
        this.buttonB = new JButton("No, Click me!");

        this.panel.add(this.buttonA);
        this.panel.add(this.buttonB);
        this.frame.add(this.panel);
        
        this.label = new JLabel("0 clicks");
        this.panel.add(this.label);

        // 2. create the listener object(s)
        ClickListener listener = new ClickListener();

        // 3. register listener objects with the component that generates events
        this.buttonA.addActionListener(listener);
        this.buttonB.addActionListener(listener);

        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);  // doesn't return until the user closes the GUI window

    }

    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }

    public class ClickListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == buttonA)
            {
                clickCountA++;
            }
            else if (event.getSource() == buttonB)
            {
                clickCountB++;            
            }
            
            label.setText("A: " + clickCountA + "; B: " + clickCountB);
        }
    }
}
