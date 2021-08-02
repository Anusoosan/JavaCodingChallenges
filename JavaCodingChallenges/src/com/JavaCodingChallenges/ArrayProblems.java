package com.JavaCodingChallenges;

import java.util.Arrays;

public class ArrayProblems {

	public static void main(String[] args) {
		int givenArray[] = { 1, 2, 3, 4, 5 };
		int arrayLength = givenArray.length;
		System.out.println("Input array = " + Arrays.toString(givenArray));

		System.out.println("###Q20. Rotate an array to the left 1 position");
		int rotateArrayToLeft[] = new int[arrayLength];
		rotateArrayToLeft[arrayLength - 1] = givenArray[0];
		for (int i = 0; i < arrayLength - 1; i++) {
			rotateArrayToLeft[i] = givenArray[i + 1];
		}
		System.out.println("Left rotate array = " + Arrays.toString(rotateArrayToLeft));

		System.out.println("###Q21. Rotate an array to the right 1 position");
		int rotateArrayToRight[] = new int[arrayLength];
		rotateArrayToRight[0] = givenArray[arrayLength - 1];
		for (int i = 1; i <= arrayLength - 1; i++) {
			rotateArrayToRight[i] = givenArray[i - 1];
		}
		System.out.println("Right rotate array = " + Arrays.toString(rotateArrayToRight));
	}

}
