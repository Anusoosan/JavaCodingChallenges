package com.JavaCodingChallenges;

public class FactorialOfANumber {

	public int printFactorial() {
		System.out.println("####### Q6. Calculate 10! #######");
		int fac = 1;
		for (int i = 1; i <= 10; i++) {
			fac = fac * i;
		}
		return fac;
	}

}
