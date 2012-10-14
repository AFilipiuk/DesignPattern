package main;

import observer.CurrentConditionsDisplay;
import observer.WeatherData;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMesaurements(80, 65, 30.4f);
		weatherData.setMesaurements(82, 70, 29.2f);
		weatherData.setMesaurements(78, 90, 29.2f);
	}

}
