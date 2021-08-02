package com.JavaCodingChallenges;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 10 };
		int[] array2 = { 5, 6, 7, 8, 9, 10, 1, 2 };
		int array1Length = array1.length;
		int array2Length = array2.length;
		int[] resultArray = new int[array1Length + array2Length];
		System.arraycopy(array1, 0, resultArray, 0, array1Length);
		System.arraycopy(array2, 0, resultArray, array1Length, array2Length);

		System.out.println(
				"### Q24 . Create a function that will merge two arrays and return the result as a new array ###");
		System.out.println("Array1 = " + Arrays.toString(array1));
		System.out.println("Array2 = " + Arrays.toString(array2));
		System.out.println("Result array = " + Arrays.toString(resultArray));

		System.out.println(
				"### Q26. Create a function that will receive two arrays and will return an array with elements that are in the first array but not in the second");
		findMissing(array1, array2, array1Length, array2Length);
		printElementsOfArray(array1);

	}

	private static void findMissing(int[] array1, int[] array2, int array1Length, int array2Length) {
		for (int i = 0; i < array1Length; i++) {
			int j;
			for (j = 0; j < array2Length; j++) {
				if (array1[i] == array2[j])
					break;
			}

			if (j == array2Length)
				System.out.print(array1[i] + " ");


		}

	}

	public static void printElementsOfArray(int[] input) {
		System.out.println(
				"\n### Q27.Create a function that will receive an array of numbers as argument and will return a new array with distinct elements ");
		for (int counter = 0; counter < input.length; counter++) {
			System.out.println(input[counter]);
		}
	}

}
