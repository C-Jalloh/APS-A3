import java.util.Calendar;
import java.util.Date;

public class Message {
    private String content;
    private UserProfile sender = new StandardUser();
    private UserProfile reciever;
    private Date timestamp = Calendar.getInstance().getTime();
    private boolean isPrivate = false;

    public Message(String content, PremiumUser sender, UserProfile reciever) {
        this.content = content;
        this.sender = sender;
        this.reciever = reciever;
        this.isPrivate = true;
    }

    public Message(String content, StandardUser sender, UserProfile reciever) {
        this.content = content;
        this.sender = sender;
        this.reciever = reciever;
    }

    public Message(String content, boolean isPrivate) {
        this.content = content;
        this.isPrivate = isPrivate;
    }

    public Message(String content) {
        this.content = content;
    }

    public Message() {

    }

    public void display() {
        String privatestring;
        if (this.isPrivate) {
            privatestring = "Private";
        } else {
            privatestring = "Not Private";
        }
        ;
        String time = String.valueOf(this.timestamp);
        String print = "\n\tContent : " + this.content +
                "\n\tSender : " + this.sender.getUsername() +
                "\n\tReceiver : " + this.reciever.getUsername() +
                "\n\tPrivate : " + privatestring +
                "\n\tTime : " + time;
        System.out.println(print);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UserProfile getSender() {
        return sender;
    }

    public void setSender(UserProfile sender) {
        this.sender = sender;
    }

    public UserProfile getReciever() {
        return reciever;
    }

    public void setReciever(UserProfile reciever) {
        this.reciever = reciever;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }
}
