package com.JavaCodingChallenges;

public class TableMultiplication {
	void printTable(int num) {
		System.out.println("###### Print the multiplication table with 7 ######");
		System.out.println("Multiplication table of " + num);
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d*%d = %d", i, num, i * num).println();
		}
	}

	void printTable() {
		System.out.println("###### Print all the multiplication tables with numbers from 1 to 10 #####");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Multiplication table of " + i);
			for (int j=1; j<=10; j++) {
				System.out.printf("%d*%d = %d", i, j, i * j).println();
				
			}
			
		}
	}

}
