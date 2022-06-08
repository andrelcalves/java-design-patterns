package Factory.exampleNotification;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser(){
        System.out.print("Sending an e-mail notification");
    }
}
