import java.util.ArrayList;

public abstract class UserProfile {

    protected Message message;
    private String username;
    private String email;
    private ArrayList<UserProfile> friends;


    public UserProfile(String username, String email) {
        this.username = username;
        this.email = email;
        this.friends = new ArrayList<>();
    }

    void addFriend(UserProfile friend) {
        if (friends.contains(friend)) {
            System.out.println(friend.getUsername() + " is already a friend of " + this.username);
        } else {
            friends.add(friend);
        }
    }

    void removeFriend(UserProfile friend) {
        if (!friends.contains(friend)) {
            System.out.println(friend.getUsername() + " is not a friend of " + this.username);
        }
        ;
        friends.remove(friend);
    }

    public String getUsername() {
        return username;
    }

    void viewFriends() {
        for (UserProfile user : friends) {
            user.display();
        }
    }

    public void sendMessage(Message sentMessage) {
        message = sentMessage;
    }

    public String display() {
        return "\n\t\tName : " + username + "\n\t\tEmail: " + email;

    }

    protected String getEmail() {
        return email;
    }
}
