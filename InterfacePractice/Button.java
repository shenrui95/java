package InterfacePractice;

import javax.swing.*;

public class Button {

    public static void main(String[] arge){
        JFrame frame =new JFrame();
        JButton button = new JButton("click plz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    
}