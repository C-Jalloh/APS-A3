/**
 * Represents a text post.
 */
public class TextPost extends Post {

    public TextPost(String content, UserProfile author) {
        super(content);
        super.setAuthor(author.getUsername(), author.getEmail());
    }

    @Override
    public void displayPost() {
        System.out.println("Text Post:");
        super.displayPost();
    }
}