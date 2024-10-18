import java.util.Calendar;

public class Main {


    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        PremiumUser ebrima = new PremiumUser("C Jalloh", "esjallow03@gmail.com");
        StandardUser tijan = new StandardUser("Tichu", "jallowt72@gmail.com");
        StandardUser sellou = new StandardUser("K Brown", "selou@gmail.com");
        Comment firstComment = new Comment("this is the first comment", tijan);
        Comment secondComment = new Comment("this is the second comment", sellou);

        Post post = new Post("this is a post");
        post.setAuthor("C Jalloh", "esjallow03@gmail.com");
        post.likePost();
        post.addComment(firstComment);
        post.addComment(secondComment);
        post.displayPost();
    }
}
