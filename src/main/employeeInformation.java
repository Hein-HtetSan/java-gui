package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class employeeInformation extends JFrame implements ActionListener{
    
    private static final int FRAME_WIDTH = 900;
    private static final int FRAME_HEIGHT = 800;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 150;

    Container contentPane;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField txtName, txtRollNo;
    JCheckBox checkBox1,  checkBox2, checkBox3, checkBox4;
    JRadioButton radioButton1, radioButton2;
    JTextArea infor;
    JComboBox department;
    JButton save, clear, exit;
    String[] depart = {"Production", "Sales", "Marketing"};

    public static void main(String args[]){
        employeeInformation frame = new employeeInformation();
        frame.setVisible(true);
    }

    public employeeInformation(){

        setTitle("");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane();
        contentPane.setLayout(null);

        l1 = new JLabel("Employee Name :");        
        l2 = new JLabel("Labourd No :");
        l3 = new JLabel("Department :");
        l4 = new JLabel("Labour Type :");        
        l5 = new JLabel("Language Skill :");
        l6 = new JLabel("Address :");

        save = new JButton("Save");
        clear = new JButton("Clear");
        exit = new JButton("Exit");

        l1.setBounds(20, 10, 100, 50);
        l2.setBounds(20, 70, 100, 50);
        l3.setBounds(20, 130, 100, 50);
        l4.setBounds(20, 190, 100, 50);
        l5.setBounds(20, 250, 100, 50);
        l6.setBounds(20, 310, 100, 50);

        save.setBounds(250, 630, 100, 50);        
        clear.setBounds(350, 630, 100, 50);
        exit.setBounds(450, 630, 100, 50);


        txtName = new JTextField();
        txtRollNo = new JTextField();
        department = new JComboBox(depart);
        infor = new JTextArea();

        // radio buttons
        ButtonGroup jobtype = new ButtonGroup();
        JPanel radioPanel = new JPanel();
        radioButton1 = new JRadioButton("Full Time");
        radioButton2 = new JRadioButton("Part Time");
        jobtype.add(radioButton1);
        jobtype.add(radioButton2);
        radioPanel.add(radioButton1);
        radioPanel.add(radioButton2);

        // check box
        JPanel checkPanel = new JPanel();
        checkBox1 = new JCheckBox("Reading");
        checkBox2 = new JCheckBox("Writing");
        checkBox3 = new JCheckBox("Listening");
        checkBox4 = new JCheckBox("Speaking");
        checkPanel.add(checkBox1);
        checkPanel.add(checkBox2);
        checkPanel.add(checkBox3);
        checkPanel.add(checkBox4);


        // text Area

        txtName.setBounds(300, 10, 500, 50);
        txtRollNo.setBounds(300, 70, 500, 50);
        department.setBounds(300, 130, 500, 50);
        radioPanel.setBounds(300, 190, 500, 30);
        checkPanel.setBounds(300, 250, 500, 30);
        infor.setBounds(300, 310, 500, 300);

        save.addActionListener(this);
        clear.addActionListener(this);
        exit.addActionListener(this);

        contentPane.add(l1);
        contentPane.add(l2);
        contentPane.add(l3);
        contentPane.add(l4);
        contentPane.add(l5);
        contentPane.add(l6);

        contentPane.add(txtName);
        contentPane.add(txtRollNo);
        contentPane.add(department);
        contentPane.add(radioPanel);
        contentPane.add(checkPanel);
        contentPane.add(infor);
        contentPane.add(save);
        contentPane.add(clear);
        contentPane.add(exit);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void actionPerformed(ActionEvent e){
        String txt = "";

        if(e.getSource().equals(save)){

            txt += l1.getText() + txtName.getText() + "\n";
            txt += l2.getText() + txtRollNo.getText() + "\n";
            txt += l3.getText() + (String) department.getSelectedItem() + "\n";
            if(radioButton1.isSelected()) txt += l4.getText() + radioButton1.getText() + "\n";
            if(radioButton2.isSelected()) txt += l4.getText() + radioButton2.getText() + "\n";
            if(checkBox1.isSelected()) txt += l5.getText() + checkBox1.getText() + "\n";
            if(checkBox2.isSelected()) txt += l5.getText() + checkBox2.getText() + "\n";
            if(checkBox3.isSelected()) txt += l5.getText() + checkBox3.getText() + "\n";
            if(checkBox4.isSelected()) txt += l5.getText() + checkBox4.getText() + "\n";
            txt += l6.getText() + infor.getText() + "\n";

            JOptionPane.showMessageDialog(this, txt);

        }else if(e.getSource().equals(clear)){

            txtName.setText("");
            txtRollNo.setText("");
            department.setSelectedIndex(0);
            if(radioButton1.isSelected()) radioButton1.setSelected(false);
            if(radioButton2.isSelected()) radioButton2.setSelected(false);
            if(checkBox1.isSelected()) checkBox1.setSelected(false);
            if(checkBox2.isSelected()) checkBox2.setSelected(false);
            if(checkBox3.isSelected()) checkBox3.setSelected(false);
            if(checkBox4.isSelected()) checkBox4.setSelected(false);
            infor.setText("");

        }else if(e.getSource().equals(exit)){
            System.exit(0);
        }

    }
}
