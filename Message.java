import java.util.Date;

public class Message {
    private String content;
    private UserProfile sender;
    private UserProfile reciever;
    private Date timestamp;
    private boolean isPrivate = false;

    public Message(String content, UserProfile sender, UserProfile reciever) {
        this.content = content;
        this.sender = sender;
        this.reciever = reciever;
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
