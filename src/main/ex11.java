package main;

// Exercise 11

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ex11 extends JFrame implements ActionListener {

    Container pane;
    JButton generate;
    JTextArea txtArea;
    JTextField txtField;
    JScrollPane scrollPane;

    // constructor
    public ex11(){
        setTitle("Prime Numbers Generator");
        setSize(500, 300);
        setLocation(150, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creating instances
        pane = getContentPane();
        generate = new JButton("Generate");
        txtField = new JTextField();
        txtArea = new JTextArea();
        scrollPane = new JScrollPane(txtArea);

        // if not, textArea will fill out all available space
        // this is important
        pane.setLayout(null);

        // set the location of each item
        generate.setBounds(250, 30, 100, 50);        
        txtField.setBounds(50, 30, 150, 50);
        scrollPane.setBounds(50, 100, 300, 100);

        // add actionListener to button
        generate.addActionListener(this);

        // adding buttons to optionpane
        pane.add(generate);
        pane.add(txtField);
        pane.add(scrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(generate)){
            String str_num =txtField.getText(); // we get string
            int int_num = Integer.parseInt(str_num); // convert string to int
            int i = 2;
            while(int_num > 0){
                
                // printing prime numbers 
                int num = checkPrimeNumber(i);
                System.out.println(num);
                if(num != -1){
                    txtArea.append(String.valueOf(num) + "\n");
                    int_num--;
                }
                i++;
            }
        }
    }

    // find the prime 
    public int checkPrimeNumber(int num) {
        int flag = num;
        for(int i = 2; i <= num/2; ++i) {
            if(num % i == 0) {
                flag = -1;
                break;
            }
        }
        return flag;
    }

    // main
    public static void main(String args[]){
        ex11 jf = new ex11();
        jf.setVisible(true);
    }

    
}
