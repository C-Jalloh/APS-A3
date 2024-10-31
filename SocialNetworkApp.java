import java.util.ArrayList;
import java.util.Scanner;


public class SocialNetworkApp {
    private static ArrayList<UserProfile> users;

    public SocialNetworkApp() {
        users = new ArrayList<>();
    }

    public static void main(String[] args) { /* ... */
        Scanner scanner = new Scanner(System.in);
        // ... create necessary objects (users, posts, etc.)

        while (true) {
            System.out.println("Enter a command (create user, create post, view feed, etc.):");
            String command = scanner.nextLine();

            switch (command) {
                case "create user":
                    // Prompt for username, email, etc.
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();

                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    // Create a new user and add to the list
                    StandardUser newUser = new StandardUser(username, email);
                    //users.add(newUser);
// Add the new user to the list of users
                    registerUser(newUser);
                    break;
                case "create post":
                    // Prompt for content, image, video, etc.

                    System.out.print("Enter post content: ");
                    String content = scanner.nextLine();


// Add the post to the user's timeline
                    StandardUser currentUser = (StandardUser) users.getFirst();
                    currentUser.createPost(new Post(content));
                    // Create a new post and add to the user's timeline
                    break;
                case "view feed":
                    // Display the user's feed (posts from friends)
                    StandardUser currentUser1 = (StandardUser) users.getFirst();
                    currentUser1.viewTimeline();
                    break;
                // ... other cases for different commands
                case "exit":
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }

    //public void displayAllUsers() { /* ... */ }

    public static void registerUser(StandardUser user) {
        if (!users.contains(user)) {
            users.add(user);
            System.out.println("User registered successfully!");
        } else {
            System.out.println("User already exists.");
        }
    }

    public UserProfile login(String username, String email) {
        for (UserProfile user : users) {
            if (user.getUsername().equals(username) && user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
    public void removeUser(UserProfile user) {
        users.remove(user);
        System.out.println("User removed successfully.");
    }

    public UserProfile findUser(String username) {
        for (UserProfile user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

}