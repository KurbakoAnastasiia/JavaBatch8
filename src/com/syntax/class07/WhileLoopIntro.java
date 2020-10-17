package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		
     int time = 15;
		
		while (time > 12) {
			System.out.println("good day");   // INFINITE LOOP
			time--;
		}
		// I want to print numbers from 1 to 50
		
		int num = 1;
		
		while (num < 51) {
			System.out.println(num);
			num++;
		}
 
		System.out.println();
		
		// I want to print number from 10 to 30 only even numbers
		
		System.out.println(" PRINTING NUMBERS 10 TO 30 ONLY EVEN");
		int num1 = 10;
		while (num1 <= 30) {
			if (num1%2 == 0) {
				System.out.print(num1 + " ");
			}
			num1++;
		}
		
		System.out.println("-----Another way-------");
		
		int num2 = 10; 
		while (num2 <= 30) {
			System.out.print(num2 + " ");
			num2+=2;
		}
		System.out.println("--------------------");
		// print numbers from 100 to 1 only odd numbers
		
		int a = 99;
		
		while (a > 0) {
			System.out.print(a + " ");
			a-=2; 
		}
		System.out.println("--------------another way---------");
		
		int b = 100;
		while (b > 0) {
			if ((b % 2) != 0) {
			System.out.print(b + " ");
			}
			b--;
		}
		
	}

}
