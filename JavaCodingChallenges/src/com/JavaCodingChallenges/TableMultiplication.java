package com.JavaCodingChallenges;

public class TableMultiplication {
	void printTable(int num) {
		System.out.println("Multiplication table of " + num);
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d*%d = %d", i, num, i * num).println();
		}
	}

	void printTable() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Multiplication table of " + i);
			for (int j=1; j<=10; j++) {
				System.out.printf("%d*%d = %d", i, j, i * j).println();
				
			}
			
		}
	}

}
