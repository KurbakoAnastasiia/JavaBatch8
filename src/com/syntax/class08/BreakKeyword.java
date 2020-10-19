package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		
		// Break
		
		for (int i = 1; i < 4; i++) {
			System.out.println("Hello");
			break;
		}
		
		// we want to print numbers from 1 to 10
		// when number is 5 we want to break the loop
		
		
		for (int a = 1; a <= 10; a++) {
			if (a == 5) {
				break;
			}
			System.out.println(a);
		} 
		
	}

}
