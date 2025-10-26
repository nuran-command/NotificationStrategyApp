package strategy;

public class SMSNotification implements NotificationStrategy {
    private String phoneNumber = "+7 701 123 45 67";
    private String notificationToSMS = "SMS sent to ";

    @Override
    public void send(String message) {
        System.out.println(notificationToSMS + phoneNumber + ": " + message);
    }
}