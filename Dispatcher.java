
import java.util.ArrayList;
import java.util.List;

//attach/detach methods
//Conc Interceptor gets attached dispatcher
//created by framework
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
            if (interceptor instanceof Interceptor) {
                ((LoggingInterceptor) interceptor).onTemperatureChange(temperature);
            }
        }
    }

    public void dispatchHumidityChange(double humidity) {
        for (Interceptor interceptor : interceptors) {
            if (interceptor instanceof Interceptor) {
                ((LoggingInterceptor) interceptor).onHumidityChange(humidity);
            }
        }
    }

    public void dispatchPressureChange(float pressure) {
        for (Interceptor interceptor : interceptors) {
            if (interceptor instanceof Interceptor) {
                ((AlertInterceptor) interceptor).onPressureChange(pressure);
            }
        }
    }
}
