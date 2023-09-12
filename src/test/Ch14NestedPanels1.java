
import javax.swing.*;
import java.awt.*;


public class Ch14NestedPanels1 extends JFrame {
    
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 350;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    public static void main(String args[]){
        Ch14NestedPanels1 frame = new Ch14NestedPanels1();
        frame.setVisible(true);
    }

    public Ch14NestedPanels1(){
        Container contentPane;
        JPanel controlPanel;
        JPanel scorePanel;

        // set the frame
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Program Ch14NestedPanel");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout());

        contentPane.add(controlPanel, BorderLayout.EAST);
        
scorePanel = new JPanel();        scorePanel.setBorder(BorderFactory.createTitledBorder("Scores:"));


        scorePanel.setLayout(new GridLayout(2, 2));
        scorePanel.add(new JLabel("Player 1 :"));
        scorePanel.add(new JLabel("    0"));
        scorePanel.add(new JLabel("Player 2 :"));
        scorePanel.add(new JLabel("      0"));

        controlPanel.add(scorePanel, BorderLayout.NORTH);
        controlPanel.add(new JButton("New Game"), BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
