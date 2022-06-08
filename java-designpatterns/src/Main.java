import Factory.exampleEncryptor.Encryptor;
import Factory.exampleEncryptor.EncryptorFactory;
import Factory.exampleEncryptor.EncyptorType;
import Factory.exampleNotification.Notification;
import Factory.exampleNotification.NotificationFactory;

public class Main {
    public static void main(String[] args) {
        // Factory  - Notification Example
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();

        // Factory - Encryptor Example
        EncryptorFactory encryptorFactory = new EncryptorFactory();
        Encryptor encryptor = new EncryptorFactory().encryptorFactory(EncyptorType.RSA);
        encryptor.encrypt();
        encryptor.decrypt();

    }
}