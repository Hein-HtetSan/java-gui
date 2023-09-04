// Event Handling with GUI

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // don't forget to import event.*

// when we work with event
// 1- we have to implement the actionlistener
// 2- we must extends JFrame because we are using it

public class ep3 extends JFrame implements ActionListener {
    JButton ok;
    JButton cancel;
    Container contentPane;
    // constructor 
    public ep3(){
        setTitle("GUI Program");
        setSize(500, 200);
        setLocation(150, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = getContentPane();
        // here we are using "FlowLayout" of "ContentPane Obj"
        contentPane.setLayout(new FlowLayout());
        ok = new JButton("OK");
        cancel = new JButton("Cancel");
        ok.addActionListener(this); // this means giving event to "ok" button 
        cancel.addActionListener(this); // this also giving event to "cancel" button

        // adding buttons to contentpane
        contentPane.add(ok);
        contentPane.add(cancel);
    }

    // we implement the actionlistener here
    @Override
    public void actionPerformed(ActionEvent e1){ // memorize this methods and its arg
        if(e1.getSource().equals(ok)){ // this means if we click ok button
            JOptionPane.showMessageDialog(null, "Ok button is clicked.");
        }
        if(e1.getSource().equals(cancel)){ // this means if we click cancel button
            JOptionPane.showMessageDialog(null, "Cancel Button is clicked");
        }
    }

    public static void main(String args[]){
        ep3 ev = new ep3();
        ev.setVisible(true);
    }
}

// humm it is easy!
// just remember if we implement something
// you have to @override it.
