package com.JavaCodingChallenges;


public class RunnerClass {

	public static void main(String[] args) {
		TableMultiplication table = new TableMultiplication();
		numberList();
		oddNumberList();
		table.printTable(7);
		table.printTable();
		SumOfNumbers sum = new SumOfNumbers();
		System.out.println("Sum of numbers from 1 to 10 is: " + sum.printSum());
		FactorialOfANumber fac = new FactorialOfANumber();
		System.out.println("10! is " + fac.printFactorial());
		System.out.println("Sum of even numbers from 10 to 30 is " + sum.printSumOfEvenNumbers());

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
