package context;

import strategy.NotificationStrategy;

public class NotificationSender {
    private NotificationStrategy strategy;

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void notifyUser(String message) {
        if (strategy == null) {
            System.out.println("No notification strategy selected!");
            return;
        }
        strategy.send(message);
    }
}