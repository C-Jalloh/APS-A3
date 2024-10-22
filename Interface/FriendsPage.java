package Interface;

import javax.swing.*;
import java.awt.*;

public class FriendsPage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Friends Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        JPanel panel = new JPanel(new BorderLayout());

        // Create a panel for the top row, containing the "Friends" label and "Back" button
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JLabel friendsLabel = new JLabel("Friends");
        JButton backButton = new JButton("Back");
        topPanel.add(friendsLabel);
        topPanel.add(Box.createHorizontalStrut(150)); // Add 10 pixels of horizontal space
        topPanel.add(backButton);
        panel.add(topPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1));
        JButton viewFriendsButton = new JButton("View Friends");
        JButton addFriendButton = new JButton("Add New Friend");
        JButton removeFriendButton = new JButton("Remove Friend");
        buttonPanel.add(viewFriendsButton);
        buttonPanel.add(addFriendButton);
        buttonPanel.add(removeFriendButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }
}
