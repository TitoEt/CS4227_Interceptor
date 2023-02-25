
//Interceptor
public interface Interceptor {
    public void update(float temp, float humidity, float pressure);

    public void onTemperatureChange(double temperature);

    public void onHumidityChange(double humidity);
}