package strategy;

public class PushNotification implements NotificationStrategy {
    private String deviceToken = "device_token_ABC123";

    @Override
    public void send(String message) {
        System.out.println("Push notification to device [" + deviceToken + "]: " + message);
    }
}