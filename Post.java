import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Represents a post in a social network.
 */
public class Post {

    private String content;
    private Date timestamp;
    private UserProfile author;
    private ArrayList<Comment> comments;
    private int likes;

    /**
     * Constructs a new post with the specified content.
     *
     * @param content The content of the post.
     */
    public Post(String content) {
        this.content = content;
        this.timestamp = Calendar.getInstance().getTime();
        this.comments = new ArrayList<>();
        this.likes = 0;
    }

    /**
     * Adds a comment to the post.
     *
     * @param comment The comment to add.
     */
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    /**
     * Increases the like count for the post.
     */
    public void likePost() {
        likes++;
    }

    /**
     * Displays the post details in a formatted way.
     */
    public void displayPost() {
    }

    ;
    public void setAuthor(String name, String mail) {
        // this.author.setUsername(name);
        //this.author.setEmail(mail);

    }
}



