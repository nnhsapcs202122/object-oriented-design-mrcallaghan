import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

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
    private JButton button;
    
    public ButtonViewer()
    {
        // 1. define and setup the UI components
        this.frame = new JFrame();
        this.panel = new JPanel();
        
        this.button = new JButton("Click me!");
        
        this.panel.add(this.button);
        this.frame.add(this.panel);
        
        // 2. create the listener object(s)
        ClickListener listener = new ClickListener();
        
        // 3. register listener objects with the component that generates events
        this.button.addActionListener(listener);
        
        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);  // doesn't return until the user closes the GUI window
        
    }
    
    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }
}
