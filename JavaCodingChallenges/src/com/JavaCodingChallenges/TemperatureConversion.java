package com.JavaCodingChallenges;

public class TemperatureConversion {


	private double temp;

	public TemperatureConversion(int temp) {
		this.temp = temp;
	}

	public double getCelsiusToFarenheit() {
		System.out.println("##### Q8: Create a function that will convert from Celsius to Fahrenheit ####");
		return ((temp * 1.8) + 32);

	}

	public double getFarenheitToCelsius() {
		System.out.println("##### Q9: Create a function that will convert from Fahrenheit to Celsius ####");
		return ((temp - 32) * 5 / 9);
	}

}
