

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch14JComboBox extends JFrame implements ActionListener, ItemListener {
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private JComboBox comboBox;

    public static void main(String args[]){
        Ch14JComboBox frame = new Ch14JComboBox();
        frame.setVisible(true);
    }

    public Ch14JComboBox() {
        Container contentPane;
        JPanel comboPanel, okPanel;

        JButton okButton;
        String[] comboBoxItem = {"Java", "C++", "Smalltalk", "Ada"};

        // set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Program Ch14JComboBoxSample");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new BorderLayout());

        // create and place a combo box
        comboPanel = new JPanel(new FlowLayout());
        comboPanel.setBorder(BorderFactory.createTitledBorder("Pick your favoirte"));

        comboBox = new JComboBox(comboBoxItem);
        comboBox.addItemListener(this);
        comboPanel.add(comboBox);

        // create and place the OK button
        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
        okButton.addActionListener(this);
        okPanel.add(okButton);

        contentPane.add(comboPanel, BorderLayout.CENTER);
        contentPane.add(okPanel, BorderLayout.SOUTH);

        // regiseter 'Exit upon closing';
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent event){
        String favorite;
        int loc;
        favorite = (String) comboBox.getSelectedItem();
        loc = comboBox.getSelectedIndex();
        JOptionPane.showMessageDialog(this, "Currently selected item ' " + favorite + "' is at index position " + loc);

    }

    public void itemStateChanged(ItemEvent event){
        String state;
        if(event.getStateChange() == ItemEvent.SELECTED){
            state = "is selected";
        }else{
            state = "is deselected";
        }
        JOptionPane.showMessageDialog(this, "JComboBox Item '" + event.getItem() + "' " + state);
    }

}
