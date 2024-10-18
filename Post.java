import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Post {

    private String content;
    private Date timestamp;
    private UserProfile author;
    private ArrayList<Comment> comments;
    private int likes;

    public Post(String content) {
        this.content = content;
        this.timestamp = Calendar.getInstance().getTime();
    }

    public void addComment(Comment comment) {
        comments = new ArrayList<>();
        comments.add(comment);
    }


    public void setAuthor(String adminName, String adminEmail) {
        this.author = new UserProfile(adminName, adminEmail) {
        };
    }

    public UserProfile getAuthor() {
        return author;
    }

    public String getComments() {

        return "";
    }

    public void likePost() {
        this.likes += 1;
    }

    @Override
    public String toString() {
        return "Post{" +
                "\n\tcontent='" + content + '\'' +
                "\n\t, timestamp=" + timestamp +
                "\n\t, author=" + author +
                "\n\t, comments=" + comments +
                "\n\t, likes=" + likes +
                "\n}";
    }

    public void displayPost() {
        System.out.println(
                "Post { " +
                        "\n\tcontent = '" + content + '\'' +
                        "\n\t timestamp = " + timestamp +
                        "\n\t author = " + this.getAuthor().display() +
                        "\n\t comments = " + getComments() +
                        "\n\t likes = " + likes +
                        "\n }");
    }

}

