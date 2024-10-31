import java.util.Calendar;
import java.util.Date;

/**
 * Represents a comment on a post in a social network.
 */
public class Comment {

    protected String content;
    private Date timestamp;
    private UserProfile author;
    private int likes;

    /**
     * Constructs a new comment with the specified content and author.
     *
     * @param content The content of the comment.
     * @param author  The author of the comment (UserProfile object).
     */
    public Comment(String content, UserProfile author) {
        this.content = content;
        this.timestamp = Calendar.getInstance().getTime(); // Capture the current date and time
        this.author = author;
        this.likes = 0; // Initialize likes to 0
    }

    /**
     * Increases the like count for the comment.
     */
    public void likeComment() {
        this.likes += 1;
    }

    /**
     * Overridden toString method to provide a human-readable representation of the comment.
     *
     * @return A formatted string containing comment details with indentation for clarity.
     */
    @Override
    public String toString() {
        return "\n\t\tComment {" +
                "\n\t\t  content = '" + content + '\'' +
                "\n\t\t  timestamp = " + timestamp +
                "\n\t\t  author = " + author +
                "\n\t\t  likes = " + likes +
                "\n\t}";
    }

    public UserProfile getAuthor() {
        return this.author;
    }
}