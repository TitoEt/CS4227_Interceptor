import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private List<Interceptor> interceptors = new ArrayList<>();

    public void registerInterceptor(Interceptor interceptor) {
        interceptors.add(interceptor);
    }

    public void removeInterceptor(Interceptor interceptor) {
        interceptors.remove(interceptor);
    }

    public void dispatchTemperatureChange(double temperature) {
        for (Interceptor interceptor : interceptors) {
            interceptor.onTemperatureChange(temperature);
        }
    }

    public void dispatchHumidityChange(double humidity) {
        for (Interceptor interceptor : interceptors) {
            interceptor.onHumidityChange(humidity);
        }
    }
}
