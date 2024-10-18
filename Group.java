import java.util.ArrayList;

/**
 * Represents a social network group.
 */
public class Group {

    private String groupName;
    private PremiumUser admin;
    private ArrayList<UserProfile> members;
    private ArrayList<Post> groupPosts;

    /**
     * Constructs a new group with the specified name.
     *
     * @param name The name of the group.
     */
    public Group(String name) {
        this.groupName = name;
        members = new ArrayList<>();
        groupPosts = new ArrayList<>();
    }

    /**
     * Sets the administrator of the group.
     *
     * @param adminName  The name of the administrator.
     * @param adminEmail The email of the administrator.
     */
    public void setAdmin(String adminName, String adminEmail) {
        this.admin = new PremiumUser(adminName, adminEmail);
    }

    /**
     * Adds a user to the group as a member.
     *
     * @param user The user to add.
     */
    public void addMember(UserProfile user) {
        members.add(user);
    }

    /**
     * Removes a user from the group.
     *
     * @param user The user to remove.
     */
    public void removeUser(UserProfile user) {
        members.remove(user);
    }

    /**
     * Posts a post to the group.
     *
     * @param post The post to post.
     */
    public void postToGroup(Post post) {
        groupPosts.add(post);
    }
}