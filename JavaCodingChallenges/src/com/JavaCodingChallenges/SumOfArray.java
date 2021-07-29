package com.JavaCodingChallenges;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SumOfArray {

	private int[] numbers;

	public SumOfArray(int[] numbers) {
		this.numbers = numbers;
	}

	public int sumOfNumbers() {

		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}


	public BigDecimal getAverage() {
		int sum = sumOfNumbers();
		int length = numbers.length;
		return new BigDecimal(sum).divide(new BigDecimal(length), 3, RoundingMode.UP);
	}

	public int maximumNumber() {
		int maximum = Integer.MIN_VALUE;
		for (int number : numbers) {
			if (number > maximum)
				maximum = number;
		}
		return maximum;
	}

}
