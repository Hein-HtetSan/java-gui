package main;

// Exercise 12

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;

public class ex29 extends JFrame implements ActionListener{

    ArrayList<Customer> customer = new ArrayList<Customer>();
    Container contentPane;
    JLabel label1, label2;
    JButton detail;
    JList<Customer> cus_list;
    Scanner scn = new Scanner(System.in);
    JScrollPane scrollPane;

    // constructor
    public ex29(){

        scn.useDelimiter(System.getProperty("line.separator"));
        int count = 0;
        // while(true){
            
        //     System.out.print("Enter name : ");
        //     String name = scn.next();
        //     System.out.print("Enter Phone number : ");
        //     String phone = scn.next();
        //     System.out.println("Enter address: ");
        //     String address = scn.next();
        //     System.out.println("Enter Artwork: ");
        //     String artwork = scn.next();
        //     System.out.println("Enter Artist: ");
        //     String artist = scn.next();
            
        //     Customer cus = new Customer(name, phone, address, artwork, artist);
        //     customer.add(cus);
        //     count++;

        //     if(count == 4){
        //         break;
        //     }
        // }
        // setting jframe
        setTitle("Latte Gallery Information");
        setLocation(150, 100);
        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = getContentPane();
        contentPane.setLayout(null);
        cus_list = new JList<Customer>();
        scrollPane = new JScrollPane(cus_list);

        label1 = new JLabel("Customer List");
        label1.setBounds(50, 50, 100, 30);
        label2 = new JLabel("Detailed information on a selected customer");
        label2.setBounds(430, 200, 300, 30);
        scrollPane.setBounds(50, 100, 200, 200);

        for(Customer c : customer){
            // here
        }

        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(scrollPane);
    }

    // override methods
    @Override
    public void actionPerformed(ActionEvent e){

    }

    // main method
    public static void main(String args[]){
        ex29 program = new ex29();
        program.setVisible(true);
    }
    
}
