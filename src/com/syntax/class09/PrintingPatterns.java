package com.syntax.class09;

import javax.annotation.processing.SupportedSourceVersion;

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
		
		
		for (int i = 1; i <= 5; i++) {
			if (i == 1) {
				for (int j = 1; j <= 10; j++) {
				System.out.print(j + " ");
			} 	System.out.println();
			} else if (i == 2) {
				for (int a = 2; a <= 20; a+=2) {
					System.out.print(a + " ");
				} System.out.println();
			} else if (i == 3) {
				for (int b = 3; b <= 30; b+=3) {
						System.out.print(b + " ");
			} System.out.println();
			} else if (i == 4) {
				for (int x = 4; x <= 40; x+=4) {
							System.out.print(x + " ");
			}	System.out.println();
			} else {
				for (int y = 5; y <= 50; y+=5) {
							System.out.print(y + " ");
			}   System.out.println();
								
						
		}
	}
		System.out.println();System.out.println("----------------------------");
		for (int i = 1; i <= 5; i++) {
		       for (int j = 1; j <= 10; j++) {
		      System.out.print((i * j) + " "); }

		    System.out.println(); }
	}
}
