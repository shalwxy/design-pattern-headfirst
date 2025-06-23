package weather_o_rama.observer;

import weather_o_rama.subject.Subject;
import weather_o_rama.subject.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private Subject subject;

	public StatisticsDisplay(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;
		if (temp > maxTemp) {
			maxTemp = temp;
		}
		if (temp < minTemp) {
			minTemp = temp;
		}
		display();
	}

	public void display() {
		System.out.printf("Avg/Max/Min temperature = %f/%f/%f\n", tempSum/numReadings, maxTemp, minTemp);
	}
}
