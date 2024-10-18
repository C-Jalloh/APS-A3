/**
 * Represents an image post.
 */
public class ImagePost extends Post {

    private String imageUrl;

    public ImagePost(String content, UserProfile author, String imageUrl) {
        super(content);
        super.setAuthor(author.getUsername(), author.getEmail());
        this.imageUrl = imageUrl;
    }

    @Override
    public void displayPost() {
        System.out.println("Image Post:");
        System.out.println("Image URL: " + imageUrl);
        super.displayPost();
    }
}