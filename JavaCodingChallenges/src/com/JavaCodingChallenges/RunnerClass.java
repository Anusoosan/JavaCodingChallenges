package com.JavaCodingChallenges;

import java.math.BigDecimal;

public class RunnerClass {

	public static void main(String[] args) {

		numberList();
		oddNumberList();
		System.out.println("### ");
		TableMultiplication table = new TableMultiplication();
		System.out.println(" ### Q3. Print the multiplication table with 7 ###");
		table.printTable(7);
		System.out.println("### Q4. Print all the multiplication tables with numbers from 1 to 10 ### ");
		table.printTable();

		System.out.println("##### Q5. Calculate the sum of numbers from 1 to 10  #######");
		SumOfNumbers sum = new SumOfNumbers();
		System.out.println("Sum of numbers from 1 to 10 is: " + sum.printSum());

		System.out.println("##### Q7. Calculate the sum of even numbers greater than 10 and less than 30  #######");
		System.out.println("Sum of even numbers from 10 to 30 is " + sum.printSumOfEvenNumbers());

		System.out.println("####### Q6. Calculate 10! #######");
		FactorialOfANumber fac = new FactorialOfANumber();
		System.out.println("10! is " + fac.printFactorial(10));

		TemperatureConversion temperature = new TemperatureConversion(88);
		System.out.println("##### Q8: Create a function that will convert from Celsius to Fahrenheit ####");
		System.out.println("Converting temperature from Celsius to farenheit: " + temperature.getCelsiusToFarenheit());

		System.out.println("##### Q9: Create a function that will convert from Fahrenheit to Celsius ####");
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

		System.out.println("### Q16: Create a function that will return a Boolean specifying if a number is prime ###");
		GetIsPrime number = new GetIsPrime(12);
		System.out.println("The giver number is prime: " + number.isPrime());



	}



	public static void numberList() {
		System.out.println("#### Q1. Print numbers from 1 to 10 #####");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public static void oddNumberList() {
		System.out.println("##### Q2. Print the odd numbers less than 100 #####");
		for (int i = 1; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

	}



}

