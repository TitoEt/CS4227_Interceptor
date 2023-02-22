import java.util.Observable;
import java.util.Observer;

public class LoggingObserver implements Observer {
    private Observer wrappedObserver;

    public LoggingObserver(Observer observer) {
        this.wrappedObserver = observer;
    }

    @Override
    public void update(Observable o, Object arg) {
        log("Before update");
        wrappedObserver.update(o, arg);
        log("After update");
    }

    private void log(String message) {
        System.out.println("LoggingObserver: " + message);
    }
}
