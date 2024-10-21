package Interface;


import javax.swing.*;
import java.awt.*;

public class WelcomePage extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());


        JButton postButton = new JButton("Post");
        postButton.setSize(12, 5);
        panel1.add(new JLabel());
        panel1.add(postButton);

        JButton friendsButton = new JButton("Friends");
        panel1.add(new JLabel());
        panel1.add(friendsButton);

        JButton messagesButton = new JButton("Messages");
        panel1.add(new JLabel());
        panel1.add(messagesButton);

        JButton upgradeButton = new JButton("Upgrade to Premium");
        upgradeButton.setSize(20, 12);
        upgradeButton.setVerticalAlignment(SwingConstants.BOTTOM);
        upgradeButton.setAlignmentY(-1);


        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(new JLabel());
        panel2.add(upgradeButton);


        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.setVisible(true);

    }

}
