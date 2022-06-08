import Factory.exampleNotification.Notification;
import Factory.exampleNotification.NotificationFactory;

public class Main {
    public static void main(String[] args) {
        // Factory  - Notification Example
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();

    }
}