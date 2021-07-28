package com.JavaCodingChallenges;

public class SumOfNumbers {

	public int printSum() {
		System.out.println("##### Calculate the sum of numbers from 1 to 10  #######");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int printSumOfEvenNumbers() {
		System.out.println("##### Calculate the sum of even numbers greater than 10 and less than 30  #######");
		int sum = 0;
		for (int i = 10; i < 30; i += 2) {
			sum = sum + i;
		}
		return sum;
	}


}
