import java.util.ArrayList;

/**
 * Represents a list of friends for a user.
 */
public class FriendList {

    private ArrayList<UserProfile> friends;

    /**
     * Constructs a new friend list.
     */
    public FriendList() {
        friends = new ArrayList<>();
    }

    /**
     * Adds a friend to the list.
     *
     * @param friend The friend to add.
     */
    public void addFriend(UserProfile friend) {
        friends.add(friend);
    }

    /**
     * Removes a friend from the list.
     *
     * @param friend The friend to remove.
     */
    public void removeFriend(UserProfile friend) {
        friends.remove(friend);
    }

    /**
     * Gets the list of friends.
     *
     * @return The list of friends.
     */
    public ArrayList<UserProfile> getFriends() {
        return friends;
    }

    /**
     * Finds a friend by username.
     *
     * @param username The username to search for.
     * @return The found friend or null if not found.
     */
    public UserProfile findFriendByUsername(String username) {
        for (UserProfile friend : friends) {
            if (friend.getUsername().equals(username)) {
                return friend;
            }
        }
        return null;
    }
}