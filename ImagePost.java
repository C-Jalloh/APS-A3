/**
 * Represents an image post.
 */
public class ImagePost extends Post {
    private String imageTitle;
    private String imageUrl;

    public ImagePost(String content, UserProfile author, String imageUrl) {
        super(content);
        super.setAuthor(author.getUsername(), author.getEmail());
        this.imageUrl = imageUrl;
        this.imageTitle = content;
    }

    @Override
    public void displayPost() {
        System.out.println("Image Post");
        System.out.println("Title: " + imageTitle);
        System.out.println("Image URL: " + imageUrl);
        super.displayPost();
    }
}