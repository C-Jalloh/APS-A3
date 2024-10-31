import java.util.Date;

public class Notification {
    private String message;
    private NotificationType type;
    private Date timestamp;

    public enum NotificationType {
        FRIEND_REQUEST,
        MESSAGE,
        LIKE,
        COMMENT
    }

    public Notification(String message, NotificationType type) {
        this.message = message;
        this.type = type;
        this.timestamp = new Date();
    }

    public String getMessage() {
        return message;
    }

    public NotificationType getType() {
        return type;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message + " at " + timestamp;
    }
}