package com.JavaCodingChallenges;

import java.math.BigDecimal;

public class RunnerClass {

	public static void main(String[] args) {

		numberList();
		oddNumberList();
		TableMultiplication table = new TableMultiplication();
		table.printTable(7);
		table.printTable();

		SumOfNumbers sum = new SumOfNumbers();
		System.out.println("Sum of numbers from 1 to 10 is: " + sum.printSum());

		System.out.println("Sum of even numbers from 10 to 30 is " + sum.printSumOfEvenNumbers());

		FactorialOfANumber fac = new FactorialOfANumber();
		System.out.println("10! is " + fac.printFactorial());

		TemperatureConversion temperature = new TemperatureConversion(88);
		System.out.println("Converting temperature from Celsius to farenheit: " + temperature.getCelsiusToFarenheit());
		System.out.println("Converting temperature from Farenheit to Celsius : " + temperature.getFarenheitToCelsius());

		int[] numbers = { 12, 34, 11, 22, 78, 65 };
		SumOfArray numberArray = new SumOfArray(numbers);
		System.out.println("### Q10. Calculate the sum of numbers in an array of numbers ####");
		System.out.println("Sum of given numbers = " + numberArray.sumOfNumbers());

		System.out.println("#### Q11. Calculate the average of the numbers in an array of numbers ###");
		BigDecimal average = numberArray.getAverage();
		System.out.println("Average of the given numbers in an array = " + numberArray.getAverage());

		System.out.println("### Q13. Find the maximum number in an array of numbers ####");
		System.out.println("Maximum number in the given array of numbers = " + numberArray.maximumNumber());

	}

	public static void numberList() {
		System.out.println("#### Print numbers from 1 to 10 #####");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public static void oddNumberList() {
		System.out.println("##### Print the odd numbers less than 100 #####");
		for (int i = 1; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

	}


}

