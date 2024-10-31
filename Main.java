public class Main {

    public static void main(String[] args) {
        // Initialize the SocialNetworkApp instance
        SocialNetwork app = new SocialNetwork();

        // Create StandardUser and PremiumUser
        UserProfile user1 = new StandardUser("Ebrima", "cjalloh@example.com");
        UserProfile user2 = new PremiumUser("Tijan", "tichu@example.com");
        StandardUser user3 = new StandardUser("mama", "mams@gmail.com");

        // Fatou creates a text and Video post
        Post videoPost = new VideoPost("A day in my life:" ,user1,"https://www.youtube.com/watch?v=KWSLBtT5FUw");
        Post textPost = new TextPost("I just started university!", user1);

        // Fatou adds Bob as a friend
        user1.addFriend(user2);
        System.out.println();

        // Fatou Creates and shares a video and a text Post
        ((StandardUser) user1).createPost(textPost);
        System.out.println();
        ((StandardUser) user1).createPost(videoPost);
        System.out.println();

        // Bob adds Fatou as a friend
        user2.addFriend(user1);
        System.out.println();

        // Bob comments and like Fatou's post
        Comment comment = new Comment("Nice post, bestie!", user2);
        textPost.addComment(comment);  // Adds Bob's comment to Fatou's post
        textPost.likePost();      // Bob likes Fatou's post
        System.out.println();

        // Display of Fatou's TimeLine
        ((StandardUser) user1).viewTimeline();
        System.out.println();

        // Fatou sends a private message to Bob
        user1.sendMessage(new Message("Hey Tijan! How's it going?"));
        System.out.println();

        // Bob views his notifications
        user2.viewNotifications();
        System.out.println();

        // Bob checks his inbox for any received messages
        user2.viewInbox();
        System.out.println();

        // Create a Group
        Group newGroup = new Group("Circle");
        newGroup.SetAdmin((PremiumUser) user2);;
        newGroup.addMember(user1);
        newGroup.addMember(user2);
        newGroup.addMember(user3);
        System.out.println();


        // Fatou Post to the Group
        Post groupPost1 = new TextPost("Hello Everyone, How are we doing today...", user1);
        newGroup.postToGroup(groupPost1);
        System.out.println();

        //Remove Bob from the Group
        newGroup.removeMember(user2);
        System.out.println();



    }
}