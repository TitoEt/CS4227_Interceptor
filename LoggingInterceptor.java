import java.lang.annotation.Annotation;

public class LoggingInterceptor implements Interceptor {
        public void onTemperatureChange(double temperature) {
        System.out.println("Temperature logging interception - changed to " + temperature);
    }

        public void onHumidityChange(double humidity) {
        System.out.println("Humidity logging interception - changed to " + humidity);
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'annotationType'");
        }

        public Object getLog() {
            return null;
        }

}
