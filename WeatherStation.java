

import java.util.*;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

	Dispatcher dispatcher = new Dispatcher();
	LoggingInterceptor loggingInterceptor = new LoggingInterceptor();
	dispatcher.registerInterceptor(loggingInterceptor);
	
	dispatcher.dispatchTemperatureChange(25.0);
	
	dispatcher.dispatchHumidityChange(60.0);
	
	dispatcher.dispatchPressureChange(1013.25f);
}
