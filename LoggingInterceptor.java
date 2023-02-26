public class LoggingInterceptor implements Interceptor {
    private double temperature;
    private double humidity;

    public void onTemperatureChange(double temperature) {
        System.out.println("Temperature logging interception - changed to " + temperature);
        this.temperature = temperature;
    }

    public void onHumidityChange(double humidity) {
        System.out.println("Humidity logging interception - changed to " + humidity);
        this.humidity = humidity;
    }

    public Object getLog() {
        return "Temperature: " + temperature + ", Humidity: " + humidity;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        onTemperatureChange(temp);
        onHumidityChange(humidity);
    }

}
