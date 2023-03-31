package Notifications;

import Notifications.Notification;
import Notifications.NotificationFactory;

import java.util.*;

public class NotificationService{

    public static void main(String[]args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("PUSH");
        notification.notifyUser();
    }
}
