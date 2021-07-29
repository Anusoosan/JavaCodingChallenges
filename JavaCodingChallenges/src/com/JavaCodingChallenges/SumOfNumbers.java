package com.JavaCodingChallenges;

public class SumOfNumbers {

	public int printSum() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int printSumOfEvenNumbers() {
		int sum = 0;
		for (int i = 10; i < 30; i += 2) {
			sum = sum + i;
		}
		return sum;
	}


}
