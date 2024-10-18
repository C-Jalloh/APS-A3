import java.util.ArrayList;

public class Group {

    private String groupName;
    private PremiumUser admin;
    private ArrayList<UserProfile> members;
    private ArrayList<Post> groupPosts;

    public Group(String name) {
        this.groupName = name;
        members = new ArrayList<>();
        groupPosts = new ArrayList<>();
    }

    public void setAdmin(String adminName, String adminEmail) {
        this.admin = new PremiumUser(adminName, adminEmail);
    }

    public void addMember(UserProfile user) {

    }

    public void removeUser(UserProfile user) {

    }

    public void postToGroup(Post post) {

    }


}
