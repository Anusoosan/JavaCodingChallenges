package com.JavaCodingChallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Please input the limit: ");
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();

		List<Integer> primeNumbers = new ArrayList<>();

		int numberToCheck = 2;
		int count = 0;
		while (true) {
			boolean isPrime = true;
			for (int divisor = 2; divisor <= numberToCheck / 2; divisor++) {
				if (numberToCheck % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				primeNumbers.add(numberToCheck);
				count++;
				if (count >= limit) {
					break;
				}
			}
			numberToCheck++;

		}
		for (int number : primeNumbers) {
			System.out.println(number);
		}
	}


}
