import java.util.ArrayList;

public class SocialNetwork {
    private ArrayList<UserProfile> users;
    private ArrayList<Post> posts;

    public SocialNetwork() {
        this.users = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    // Method to add a user to the platform
    public void addUser(UserProfile user) {
        users.add(user);
    }

    // Method to add a user to the platform
    public void addPost(Post post) {
        posts.add(post);
    }

    // Method to Log in a user by username and email
    public UserProfile login(String username, String email) {
        for (UserProfile user : users) {
            if (user.getUsername().equals(username) && user.getEmail().equals(email)) {
                System.out.println(username + " has logged in successfully.");
                return user;
            }
        }
        System.out.println("Login failed: Invalid username or email.");
        return null;
    }

    // Display all posts with comments and likes
    public void displayAllPosts() {
        for (Post post : posts) {
            post.displayPost();
            System.out.println("Likes: " + post.likes);
            System.out.println("Comments:");
            for (Comment comment : post.comments) {
                System.out.println(" - " + comment.content + " by " + comment.getAuthor().getUsername());
            }
            System.out.println();
        }
    }
}