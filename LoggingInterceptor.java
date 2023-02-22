import java.lang.annotation.Annotation;

public class LoggingInterceptor implements Interceptor {
    public void onTemperatureChange(double temperature) {
        // Implement logging of temperature change
    }

    public void onHumidityChange(double humidity) {
        // Implement logging of humidity change
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'annotationType'");
    }

}
