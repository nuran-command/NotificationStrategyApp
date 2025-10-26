package strategy;

public class PushNotification implements NotificationStrategy {
    String deviceToken = "device_token_ABC123";
    String notificationToPush = "Push notification to device";

    @Override
    public void send(String message) {
        System.out.println(notificationToPush + "[" + deviceToken + "]"  + message);
    }
}