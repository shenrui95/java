package InterfacePractice;

import javax.swing.*;
import java.awt.event.*;
public class ButtonEventText implements ActionListener {
    private static String labelPrefix = "Number of button clicks:";
    private int numClicks = 0;
    JLabel label = new JLabel (labelPrefix + "0   ");
    public void go (String title) {
        JFrame frame =new JFrame();
        JButton button = new JButton("click plz");
        button.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event) {
        label.setText(labelPrefix + ++numClicks);
    }

    public static void main(String[] arge){
        ButtonEventText button = new ButtonEventText();
        button.go("Event handling");
    }
    
}