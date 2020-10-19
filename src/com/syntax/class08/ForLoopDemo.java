package com.syntax.class08;

public class ForLoopDemo {

	public static void main(String[] args) {
		/*
		 * FOR Syntax
		 * for (initialization; condition; increment/decrement) {
		 * code;
		 * }
		 */
		
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Good Morning");
		}
		/* I want to print number 1 to 100
		 * 
		 * FOR Syntax
		 * for (start point; end point; increment/decrement) {
		 * code;
		 * }
		 */
		for (int b = 1; b <= 100; b++) {
			System.out.println(b);
		}
		
		System.out.println("-----I want to print number 10 to 0 -----------------");
		
		for (int a = 10; a >= 0; a--) {
			System.out.print(a + " ");
		}
		System.out.println("What will be the output?");
		for (int c = 0; c <= 30; c+=3) {
			System.out.print(c + " ");
		}
		
	}

}
