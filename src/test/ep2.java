
// testing Content Pane of a Frame

import javax.swing.*;
import java.awt.*;

public class ep2 extends JFrame {
    public ep2(){
        setTitle("Content Pane"); // set the window title
        setSize(500, 500); // frame size of window
        setLocation(100, 150); // position of frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminate program when click the close btn
    }
    public static void main(String args[]){
        ep2 jf = new ep2(); // create instance of ep2
        Container container = jf.getContentPane(); // content pane
        container.setBackground(Color.BLUE); // set the content pane bg to blue

        JButton okButton = new JButton("Ok"); // create button obj
        container.setLayout(null); // i think that : we are not using any layout on ContentPane
        okButton.setBounds(70, 125, 80, 30); // customize as you wish
        container.add(okButton); // set the button onto content pane

        jf.setVisible(true); // set visibility to true
    }
}
