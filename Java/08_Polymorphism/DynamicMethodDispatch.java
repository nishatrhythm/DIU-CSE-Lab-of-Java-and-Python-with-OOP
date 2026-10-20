class Notification {
    void sendNotification(String message) {
        System.out.println("Generic Notification: " + message);
    }
}

class EmailNotification extends Notification {
    @Override
    void sendNotification(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSNotification extends Notification {
    @Override
    void sendNotification(String message) {
        System.out.println("SMS sent to phone: " + message);
    }
}

class PushNotification extends Notification {
    @Override
    void sendNotification(String message) {
        System.out.println("App Push alert: " + message);
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Notification notification;

        notification = new EmailNotification();
        notification.sendNotification("Exam starts at 10:00 AM.");

        notification = new SMSNotification();
        notification.sendNotification("Your OTP is 948201.");

        notification = new PushNotification();
        notification.sendNotification("You have a new lab assignment.");

        Notification[] notifications = {
            new EmailNotification(),
            new SMSNotification(),
            new PushNotification()
        };

        System.out.println("\nIterating through array of superclass references:");
        for (Notification n : notifications) {
            n.sendNotification("Broadcast message to all channels.");
        }
    }
}
