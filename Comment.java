import java.util.Calendar;
import java.util.Date;

public class Comment {

    private String content;
    private Date timestamp;
    private UserProfile author;
    private int likes;


    public Comment(String content, UserProfile author) {
        this.content = content;
        this.timestamp = Calendar.getInstance().getTime();
        ;
        this.author = author;
    }

    public void likeComment() {
        this.likes += 1;
    }

    @Override
    public String toString() {
        return "\n\t\tComment { " +
                "\n\t\t  content = '" + content + '\'' +
                "\n\t\t  timestamp = " + timestamp +
                "\n\t\t  author = " + author +
                "\n\t\t  likes = " + likes +
                "\n\t}";
    }


}
