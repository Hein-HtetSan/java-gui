
import javax.swing.*;
// import java.awt.*;

// testing JFrame as a subclass by extending it

public class ep1 extends JFrame{
    public ep1(){
        setTitle("First GUI Program");
        setSize(300, 200);
        setLocation(150, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        ep1 jf = new ep1();
        jf.setVisible(true);
    }
}