
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleProgram extends JFrame {
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private JButton cancelButton;
    private JButton okButton;

    public static void main(String args[]){
        SampleProgram frame = new SampleProgram();
        frame.setVisible(true);
    }

    public SampleProgram(){
        Container contentPane = getContentPane();

        // set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program JButton Action Frame");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        // set the layout manager
        contentPane.setLayout(new FlowLayout());

        // create and place two buttons on the frame's content pane
        okButton = new JButton("OK");
        contentPane.add(okButton);

        cancelButton = new JButton("CANCEL");
        contentPane.add(cancelButton);

        // registering a buttonHandler as an action listener of the two buttons
    }

}
