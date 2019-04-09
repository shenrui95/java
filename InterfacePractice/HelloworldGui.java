package InterfacePractice;

import javax.swing.*;

public class HelloworldGui {

    public static void main(String[] arge){
        JFrame frame =new JFrame("HellowworldSwing");
        final JLabel label = new JLabel("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.getContentPane().add(label);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    
}