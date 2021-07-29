package com.JavaCodingChallenges;

public class FactorialOfANumber {


	public int printFactorial(int num) {
		System.out.println("####### Q6. Calculate 10! #######");
		int fac = 1;
		for (int i = 1; i <= num; i++) {
			fac = fac * i;
		}
		return fac;
	}

}
