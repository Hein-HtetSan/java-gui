
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class Ch14JCheckBox extends JFrame implements ActionListener {
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private JCheckBox[] checkBoxs;

    public static void main(String args[]){
        Ch14JCheckBox frame = new Ch14JCheckBox();
        frame.setVisible(true);
    }

    public Ch14JCheckBox(){
        Container contentPane;
        JPanel checkPanel, okPanel;

        JButton okButton;
        String[] btnText = {"Java", "C++", "Smalltalk", "Ada"};

        //set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Program Ch14 JCheckBOx");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new BorderLayout());

        // create and place four check boxes
        checkPanel = new JPanel(new GridLayout(0, 1));
        checkPanel.setBorder(BorderFactory.createTitledBorder("Can program in"));

        checkBoxs = new JCheckBox[btnText.length];

        for(int i=0; i<checkBoxs.length; i++){
            checkBoxs[i] = new JCheckBox(btnText[i]);
            checkPanel.add(checkBoxs[i]);
        }

        // create and place the OK button
        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
        okButton.addActionListener(this);
        okPanel.add(okButton);

        contentPane.add(checkPanel, BorderLayout.CENTER);
        contentPane.add(okPanel, BorderLayout.SOUTH);

        // register 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event){
        StringBuffer skill = new StringBuffer("You can program in");
        for(int i=0; i<checkBoxs.length; i++){
            if(checkBoxs[i].isSelected()){
                skill.append(checkBoxs[i].getText() + "\n");
            }
        }
        JOptionPane.showMessageDialog(this, skill.toString());
    }

}
