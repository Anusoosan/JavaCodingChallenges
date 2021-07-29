package com.JavaCodingChallenges;

public class TemperatureConversion {


	private double temp;

	public TemperatureConversion(int temp) {
		this.temp = temp;
	}

	public double getCelsiusToFarenheit() {
		return ((temp * 1.8) + 32);

	}

	public double getFarenheitToCelsius() {
		return ((temp - 32) * 5 / 9);
	}

}
