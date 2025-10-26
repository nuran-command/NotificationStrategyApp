package strategy;

public class EmailNotification implements NotificationStrategy {
    String emailAddress = "user@example.com";
    String notificationToEmail = "Email sent to ";

    @Override
    public void send(String message) {
        System.out.println(notificationToEmail + emailAddress + ": " + message);
    }
}