package exampleNotification;

public class PushNotification implements Notification{
    @Override
    public void notifyUser(){
        System.out.print("Sending a push notification");
    }
}
