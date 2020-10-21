package com.syntax.class09;

public class PrintingPatterns {

	public static void main(String[] args) {
	
		for (int r = 1; r <= 6; r++) { // outer loop control rows
			for (int c = 1; c <= 12; c++) { // inner loop control columns
			System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------SQUARE of NUMBERS----------------");
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 8; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		for (int i = 7; i >= 1; i--) {
			for (int j = 1; j <= 6; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		for (int i = 1; i <= 5; i++) { // we do not care about what is the value of i, as long as it gives 5 rows
			for (int j = 7; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
