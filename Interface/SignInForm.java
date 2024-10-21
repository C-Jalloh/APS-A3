package Interface;


import javax.swing.*;
import java.awt.*;

public class SignInForm extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sign In Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(0, 2));


        JLabel welcomeLabel = new JLabel("Welcome");
        panel1.add(welcomeLabel);
        panel1.add(new JLabel());

        JLabel nameLabel = new JLabel("Name");
        JTextField nameField = new JTextField();
        panel1.add(nameLabel);
        panel1.add(nameField);

        JLabel emailLabel = new JLabel("Email");
        JTextField emailField = new JTextField();
        panel1.add(emailLabel);
        panel1.add(emailField);

        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passField = new JPasswordField();
        passField.setActionCommand("OK");
        panel1.add(passwordLabel);
        panel1.add(passField);

        JButton signInButton = new JButton("Sign In");
        signInButton.setSize(20, 12);
        signInButton.setVerticalAlignment(SwingConstants.BOTTOM);
        signInButton.setAlignmentY(-1);


        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(new JLabel());
        panel2.add(signInButton);


        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.setVisible(true);

    }
}
