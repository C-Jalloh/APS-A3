package Interface;


import javax.swing.*;
import java.awt.*;

public class PostsPage extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Posts Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        JLabel label = new JLabel(" Let's Goo!!!");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel1.add(label);
        panel1.add(Box.createHorizontalStrut(10));
        panel1.add(Box.createHorizontalStrut(10));
        JButton createPost = new JButton("Create a post");
        createPost.setSize(300, 50);
        createPost.setVerticalAlignment(SwingConstants.CENTER);
        createPost.setAlignmentY(Component.CENTER_ALIGNMENT);
        createPost.setBackground(Color.red);


        panel1.add(new JLabel());
        panel1.add(createPost);
        panel1.add(Box.createVerticalStrut(10));
        panel1.add(Box.createHorizontalStrut(5));


        JButton viewPost = new JButton("View a post");
        viewPost.setSize(20, 12);
        viewPost.setVerticalAlignment(SwingConstants.CENTER);
        viewPost.setAlignmentY(Component.CENTER_ALIGNMENT);
        viewPost.setBackground(Color.orange);


        panel1.add(new JLabel());
        panel1.add(viewPost);
        panel1.add(Box.createVerticalStrut(10));
        panel1.add(Box.createHorizontalStrut(5));

        JButton deletePost = new JButton("Delete a post");
        deletePost.setSize(20, 12);
        deletePost.setVerticalAlignment(SwingConstants.CENTER);
        deletePost.setBackground(Color.blue);

        panel1.add(new JLabel());
        panel1.add(deletePost);
        panel1.add(Box.createVerticalStrut(10));
        panel1.add(Box.createHorizontalStrut(5));

        JButton commentPost = new JButton("comment on a post");
        commentPost.setSize(20, 12);
        commentPost.setVerticalAlignment(SwingConstants.CENTER);
        commentPost.setBackground(Color.gray);

        panel1.add(new JLabel());
        panel1.add(commentPost);
        panel1.add(Box.createVerticalStrut(10));
        panel1.add(Box.createHorizontalStrut(5));

        JButton likePost = new JButton("Like a post");
        likePost.setSize(20, 12);
        likePost.setVerticalAlignment(SwingConstants.CENTER);
        likePost.setBackground(Color.yellow);

        panel1.add(new JLabel());
        panel1.add(likePost);
        panel1.add(Box.createVerticalStrut(10));


        JButton upgradeButton = new JButton("Upgrade to Premium");


        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(new JLabel());
        panel2.add(upgradeButton);


        panel1.setBackground(Color.lightGray);
        frame.add(panel1);

        frame.setVisible(true);

    }

}
