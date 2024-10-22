package Interface;

import javax.swing.*;
import java.awt.*;

public class CommentPage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Comment Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel(new BorderLayout());

        JLabel commentLabel = new JLabel("Comment");
        panel.add(commentLabel, BorderLayout.NORTH);

        JPanel commentPanel = new JPanel();
        JTextArea commentArea = new JTextArea(5, 20); // Adjust rows and columns as needed
        JButton postButton = new JButton("Post");
        JButton cancelButton = new JButton("Cancel");
        commentPanel.add(commentArea);
        commentPanel.add(postButton);
        commentPanel.add(cancelButton);
        panel.add(commentPanel, BorderLayout.CENTER);

        frame.add(panel);
        frame.setVisible(true);
    }
}