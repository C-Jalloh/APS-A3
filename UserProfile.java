import java.util.ArrayList;

public abstract class UserProfile {

    protected Message message;  // Consider making this private for better encapsulation
    protected String username;
    protected String email;
    protected ArrayList<UserProfile> friends;
    protected FriendList friendList;
    protected ArrayList<Message> messageList;

    public UserProfile(String username, String email) {
        this.username = username;
        this.email = email;
        this.friends = new ArrayList<>();
        this.friendList = new FriendList();
    }

    public UserProfile() {
        this.friends = new ArrayList<>();
        this.friendList = new FriendList();
    }

    ;
    public void addFriend(UserProfile friend) {
        if (!friends.contains(friend)) {
            friends.add(friend);
            friend.addFriend(this);  // Assuming mutual friendship
            friendList.addFriend(friend);
        } else {
            System.out.println(friend.getUsername() + " is already a friend.");
        }
    }

    public void removeFriend(UserProfile friend) {
        if (friends.contains(friend)) {
            friends.remove(friend);
            friendList.removeFriend(friend);
            friend.removeFriend(this);  // Assuming mutual friendship
        } else {
            System.out.println(friend.getUsername() + " is not a friend.");
        }
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;  // Make this public if needed for other parts of the application
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void viewFriends() {
        if (friends.isEmpty()) {
            System.out.println("No friends to display.");
        } else {
            System.out.println("Friends of " + username + ":");
            for (UserProfile friend : friends) {
                System.out.println(friend.getUsername());
            }
        }
    }

    public void getFriendByUsername(String username) {
        for (UserProfile friend : friends) {
            if (friend.getUsername().equals(username)) {
                System.out.println(friend.display());
            }
        }
        ;
    }
    public String display() {
        return "\n\t\tName : " + username + "\n\t\tEmail: " + email;
    }

    public void sendMessage(Message sentMessage) {
        message = sentMessage;
        messageList = new ArrayList<>();
        messageList.add(sentMessage);

    }

    public void setUsername(String username) {
        this.username = username;
    }

}