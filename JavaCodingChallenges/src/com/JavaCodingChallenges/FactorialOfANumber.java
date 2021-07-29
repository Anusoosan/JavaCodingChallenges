package com.JavaCodingChallenges;

public class FactorialOfANumber {


	public int printFactorial(int num) {

		int fac = 1;
		for (int i = 1; i <= num; i++) {
			fac = fac * i;
		}
		return fac;
	}

}
