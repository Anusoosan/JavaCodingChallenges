package com.JavaCodingChallenges;

public class ArrayReversal {

	public static void main(String[] args) {
		int[] numberArray = { 10, 20, 30, 40, 50, 60, 70, 20, 90 };
		System.out.println("Original array ");
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print(numberArray[i] + " ");
		}
		System.out.println("\nReversed Array:");
		for (int i = numberArray.length - 1; i >= 0; i--) {
			System.out.print(numberArray[i] + " ");
		}
	}

}
