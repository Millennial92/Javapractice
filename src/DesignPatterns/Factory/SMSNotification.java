package DesignPatterns.Factory;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser()
{
    System.out.println("Sending a SMS notification.");
}
}
