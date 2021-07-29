package com.JavaCodingChallenges;

public class GetIsPrime {

	private int number;

	public GetIsPrime(int number) {
		this.number = number;

	}

	public boolean isPrime() {
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

}
