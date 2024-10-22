package Interface;

import javax.swing.*;
import java.awt.*;

public class ViewPostPage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("View Post");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel(new BorderLayout());

        JLabel postLabel = new JLabel("Post:");
        panel.add(postLabel, BorderLayout.NORTH);

        JTextArea postContentArea = new JTextArea(5, 20); // Adjust rows and columns as needed
        postContentArea.setEditable(false); // Make the text area non-editable
        panel.add(postContentArea, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton likeButton = new JButton("Like");
        JButton commentButton = new JButton("Comment");
        buttonPanel.add(likeButton);
        buttonPanel.add(commentButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }
}