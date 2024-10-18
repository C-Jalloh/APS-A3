

/**
 * Represents a video post.
 */
public class VideoPost extends Post {

    private String videoUrl;

    public VideoPost(String content, UserProfile author, String videoUrl) {
        super(content);
        super.setAuthor(author.getUsername(), author.getEmail());
        this.videoUrl = videoUrl;
    }

    @Override
    public void displayPost() {
        System.out.println("Video Post:");
        System.out.println("Video URL: " + videoUrl);
        super.displayPost();
    }
}