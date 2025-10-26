package strategy;

public class EmailNotification implements NotificationStrategy {
    private String emailAddress = "user@example.com";
    private String notificationToEmail = "Email sent to ";

    @Override
    public void send(String message) {
        System.out.println(notificationToEmail + emailAddress + ": " + message);
    }
}