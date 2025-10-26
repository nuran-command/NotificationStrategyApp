import context.NotificationSender;
import strategy.EmailNotification;
import strategy.SMSNotification;
import strategy.PushNotification;

public class Main {
    public static void main(String[] args) {
        NotificationSender sender = new NotificationSender();

        String message1 = "Your order #12345 has been shipped.";
        String message2 = "New login detected.";
        String message3 = "Your report is ready.";

        sender.setStrategy(new EmailNotification());
        sender.notifyUser(message1);

        sender.setStrategy(new SMSNotification());
        sender.notifyUser(message2);

        sender.setStrategy(new PushNotification());
        sender.notifyUser(message3);

        sender.setStrategy(null);
        sender.notifyUser("This message won't be sent.");
    }
}