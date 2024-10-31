import java.util.ArrayList;

public class StandardUser extends UserProfile implements Postable {
    private ArrayList<Post> posts;

    public StandardUser(String username, String email) {
        super(username, email);
        this.posts = new ArrayList<>();
    }

    public StandardUser() {
        this.posts = new ArrayList<>();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }


    /**
     * Creates a new post and adds it to the user's feed.
     *
     * @param post The post to create.
     */
    @Override
    public void createPost(Post post) {
        posts.add(post);
        post.setAuthor(super.getUsername(), super.getEmail());
    }

    /**
     * Views the user's timeline, displaying all posts and comments.
     */
    @Override
    public void viewTimeline() {
        System.out.println("My Timeline:");
        for (Post post : posts) {
            post.displayPost();
        }
    }

    /**
     * Likes a post.
     *
     * @param post The post to like.
     */
    public void likePost(Post post) {
        post.likePost();
    }

    /**
     * Makes a comment on a post.
     *
     * @param post    The post to comment on.
     * @param comment The comment to add.
     */
    public void makeComment(Post post, Comment comment) {
        post.addComment(comment);
    }

    public Post getPosts() {
        for(Post post : posts){
            return post;
        }

        return null;
    }
}