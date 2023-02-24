public class LoggingInterceptor implements Interceptor {
        public void onTemperatureChange(double temperature) {
        System.out.println("Temperature logging interception - changed to " + temperature);
    }

        public void onHumidityChange(double humidity) {
        System.out.println("Humidity logging interception - changed to " + humidity);
        }

        public Object getLog() {
            return null;
        }

        @Override
        public void update(float temp, float humidity, float pressure) {
            throw new UnsupportedOperationException("Unimplemented method 'update'");
        }

}
