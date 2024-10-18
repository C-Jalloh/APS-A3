public interface Postable {

    /**
     * Creates a new post and adds it to the user's feed.
     *
     * @param post The post to create.
     */
    void createPost(Post post);

    /**
     * Views the user's timeline, displaying all posts and comments.
     */
    void viewTimeline();
}