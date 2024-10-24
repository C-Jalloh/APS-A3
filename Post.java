import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Represents a post in a social network.
 */
public class Post {

    protected String content;
    protected Date timestamp;
    protected StandardUser author = new StandardUser();
    protected ArrayList<Comment> comments;
    protected int likes;

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
        System.out.println(
                "\tContent : " + content +
                        "\n\tAuthor : " + author.getUsername() +
                        "\n\tLikes : " + likes +
                        "\n\tTime : " + timestamp.toString()
        );
    }

    ;
    public void setAuthor(String name, String mail) {
        this.author.setUsername(name);
        this.author.setEmail(mail);

    }
}



