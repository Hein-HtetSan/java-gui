
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch14JRadioButton extends JFrame implements ActionListener, ItemListener {
    

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private JRadioButton[] radioButton;

    public static void main(String args[]){
        Ch14JRadioButton frame = new Ch14JRadioButton();
        frame.setVisible(true);
    }

    public Ch14JRadioButton(){
        Container contentPane;
        JPanel radioPanel, okPanel;
        ButtonGroup languageGroup;

        JButton okButton;
        String[] btnText = {"Java", "C++", "Smalltalk", "Ada"};

        //set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Program Ch14RadioButton");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new BorderLayout());

        // create and place four radio buttons
        radioPanel = new JPanel(new GridLayout(0, 1));
        radioPanel.setBorder(BorderFactory.createTitledBorder("Pick your favorite"));

        languageGroup = new ButtonGroup();
        radioButton = new JRadioButton[btnText.length];

        for (int i=0; i<radioButton.length; i++){
            radioButton[i] = new JRadioButton(btnText[i]);
            radioButton[i].addItemListener(this);
            languageGroup.add(radioButton[i]);
            radioPanel.add(radioButton[i]);
        }

        // selected the first choice
        radioButton[0].setSelected(true);

        // create and place the ok button
        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
        okButton.addActionListener(this);
        okPanel.add(okButton);

        contentPane.add(radioPanel, BorderLayout.CENTER);
        contentPane.add(okPanel, BorderLayout.SOUTH);

        // register 'Exit on close'
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String favorite = null;
        int i=0; 
        while(favorite == null){
            if(radioButton[i].isSelected()){
                favorite = radioButton[i].getText();
            }
            i++;
        }
        JOptionPane.showMessageDialog(this, "Your favorite language" + favorite);
    }

    public void itemStateChanged(ItemEvent e){
        JRadioButton source = (JRadioButton) e.getSource();
        String state;
        if(e.getStateChange() == ItemEvent.SELECTED){
            state = "is selected";
        }else{
            state = "is deselected";
        }
        JOptionPane.showMessageDialog(this, "JRadioButton '" + source.getText() + "' " + state);
    }

}
