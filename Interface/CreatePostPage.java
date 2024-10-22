package Interface;

import javax.swing.*;
import java.awt.*;

public class CreatePostPage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Create Post");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel(new GridLayout(2, 1));

        JLabel createPostLabel = new JLabel("Create Post");
        panel.add(createPostLabel);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        JLabel contentLabel = new JLabel("Content:");
        JTextArea contentArea = new JTextArea(5, 20); // Adjust rows and columns as needed
        contentPanel.add(contentLabel, BorderLayout.WEST);
        contentPanel.add(contentArea, BorderLayout.CENTER);
        panel.add(contentPanel);


        frame.add(panel);
        frame.setVisible(true);
    }
}