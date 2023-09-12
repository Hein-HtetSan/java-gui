
import javax.swing.*;
import java.awt.*;

public class Ch14NestedPanels2 extends JFrame {
    
    private static final int FRAME_WIDTH = 250;
    private static final int FRAME_HEIGHT = 270;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private final String ENTER = "Enter";
    private final String CANCEL = "Cancel";
    private final String BLANK = "";

    private JTextField guessEntry;
    private JLabel hint;

    public static void main(String args[]){
        Ch14NestedPanels2 frame = new Ch14NestedPanels2();
        frame.setVisible(true);
    }

    public Ch14NestedPanels2(){
        JPanel guessPanel, hintPanel, controlPanel, buttoPanel;
        JButton enterButton, canButton;

        Container contentPane;

        // set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Program ch14NestedPanels2");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(3, 1));
        guessPanel = new JPanel();
        guessPanel.setBorder(BorderFactory.createTitledBorder("Your Guess"));

        guessPanel.add(guessEntry = new JTextField(10));

        hintPanel = new JPanel();
        hintPanel.setBorder(BorderFactory.createTitledBorder("Hint"));
        hintPanel.add(hint = new JLabel("let's play hilo"));

        controlPanel = new JPanel(new BorderLayout());
        buttoPanel = new JPanel();
        buttoPanel.add(enterButton = new JButton(ENTER));
        buttoPanel.add(buttoPanel, BorderLayout.SOUTH);

        contentPane.add(guessPanel);
        contentPane.add(hintPanel);
        contentPane.add(controlPanel);


    }


}
