
// Display a frame with two buttons, one text field, and one text area;

import javax.swing.*;
import javax.swing.tree.FixedHeightLayoutCache;

import java.awt.*;
import java.awt.event.*;


public class TextFrame extends JFrame implements ActionListener{

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 250;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private static final String EMPTY_STRING = "";
    private static final String NEWLINE = System.getProperty("line.separator");

    private JButton clearButton;
    private JButton addButton;
    private JTextField inputLine;
    private JTextArea textArea;

    public static void main(String args[]){
        TextFrame frame = new TextFrame();
        frame.setVisible(true);
    }

    public TextFrame(){

        Container contentPane;

        // set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Ch14TextFrame3");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        textArea = new JTextArea();
        textArea.setColumns(22);
        textArea.setRows(8);
        textArea.setBorder(BorderFactory.createLineBorder(Color.RED));

        textArea.setEditable(false);
        contentPane.add(textArea);

        inputLine = new JTextField();
        inputLine.setColumns(22);
        contentPane.add(inputLine);

        inputLine.addActionListener(this);

        // create and place two buttons on the frame
        addButton = new JButton("ADD");
        contentPane.add(addButton);

        clearButton = new JButton("CLEAR");
        contentPane.add(clearButton);

        // register this frame as an action listener of the frame
        clearButton.addActionListener(this);
        addButton.addActionListener(this);

        // register 'Exit upon closing'
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event){
        if(event.getSource() instanceof JButton){
            JButton clickedButton = (JButton) event.getSource();

            if(clickedButton == addButton){
                addText(inputLine.getText());
            }else{
                clearText();
            }
        }
    }

    // add text method
    private void addText(String newline){
        textArea.append(newline + NEWLINE);
        inputLine.setText("");
    }

    // clear text method
    private void clearText(){
        textArea.setText(EMPTY_STRING);
        inputLine.setText(EMPTY_STRING);
    }

}
