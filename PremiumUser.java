public class PremiumUser extends UserProfile implements Postable {
    public PremiumUser(String username, String email) {
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


    public void createGroup(String gname) {
        Group group = new Group(gname);
        group.setAdmin(super.getUsername(), super.getEmail());
    }

    @Override
    public void sendMessage(Message sentMessage) {
        super.message = sentMessage;
        message.setPrivate(true);
    }
}
