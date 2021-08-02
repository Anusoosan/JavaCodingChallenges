package com.JavaCodingChallenges;

public class StringReversal {

	public static void main(String[] args) {
		String str = "This is a really long string with many alphabets";
		System.out.println("The original string is : " + str);
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reversed String is : ");
		System.out.println(sb.reverse());

	}

}
