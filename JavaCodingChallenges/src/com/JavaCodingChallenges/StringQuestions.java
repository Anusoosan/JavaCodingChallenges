package com.JavaCodingChallenges;

import java.util.Arrays;

public class StringQuestions {

	public static void main(String[] args) {
		System.out.println("###Q31. Create a function that will return the number of words in a text");
		String str = "This is a very long text with alphabets & numbers";
		int stringLength = str.length();
		System.out.println("Length of the String = " + stringLength);

		System.out.println("##Q32. Create a function that will capitalize the first letter of each word in a text");
		StringBuilder sb = new StringBuilder(stringLength);
		String[] words = str.split("\\ ");
		for (int i = 0; i < words.length; i++) {
			sb.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");

		}
		System.out.println("The new string is : " + sb);

		System.out.println("###Q33. Calculate the sum of numbers received in a comma delimited string ###");
		String numberString = "12,14,16,9";
		String[] strNumbers = numberString.split(",");
		int sumOfString = 0;
		for (String number : strNumbers) {
			sumOfString += Integer.parseInt(number);
		}
		System.out.println("Sum of the numbers in String = " + sumOfString);

		System.out.println("##Q34. Create a function that returns an array with words inside a text.");
		String sentence = "I love to travel around the world";
		String[] stringOfWords = sentence.split("\\ ");
		System.out.println(Arrays.toString(stringOfWords));

		System.out.println("###Q36. Create a function that converts a string to an array of characters");
		String sampleString = "Monday";
		String[] stringCharacters = sampleString.split("");
		System.out.println(Arrays.toString(stringCharacters));

		System.out.println("##Q49. Shuffle an array of strings");
		String[] stringArray = { "Monday", "Saturday", "Tuesday", "Friday", "Sunday" };
		shuffle(stringArray);
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i] + " ");
		}

		System.out.println("\n###Q48. Create a function to return the longest word in a string");
		String wordsInString[] = sentence.split(" ");
		int maxLength = 0;
		String longestWord = "";
		for (int i = 0; i < wordsInString.length; i++) {
			String word = wordsInString[i];
			int length = word.length();
			if (length > maxLength) {
				longestWord = word;
				maxLength = length;
			}

		}
		System.out.println("Longest word in the given string: " + longestWord);


	}

	public static void shuffle(Object[] array) {
		int numberOfElements = array.length;
		for (int i = 0; i < numberOfElements; i++) {
			int index = (int) (Math.random() * (numberOfElements - 1));

			Object temp = array[index];
			array[index] = array[i];
			array[i] = temp;

		}

	}

}
