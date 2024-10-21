package Interface;

import javax.swing.*;
import java.awt.*;

public class gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2, 2));
        JLabel label1 = new JLabel("Label 1");
        JTextField textField1 = new JTextField(20);
        panel1.add(label1);
        panel1.add(textField1);
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        JButton button1 = new JButton("Button 1");
        panel2.add(button1);

        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);


        frame.setVisible(true);


    }


}
