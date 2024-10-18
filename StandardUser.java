public class StandardUser extends UserProfile implements Postable {


    public StandardUser(String username, String email) {
        super(username, email);
    }

    /**
     * @param post is a Post Object
     */
    @Override
    public void createPost(Post post) {

    }

    /**
     *
     */
    @Override
    public void viewTimeline() {

    }

    public void likeAPost(Post post) {
        post.likePost();
    }

    public void MakeComment(Post post, Comment comment) {
        post.addComment(comment);
    }
}
