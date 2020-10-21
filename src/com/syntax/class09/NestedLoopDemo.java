package com.syntax.class09;

public class NestedLoopDemo {

	public static void main(String[] args) {
	
		for (int i = 0; i < 3; i++) { // outer loop
			
			System.out.println("Hello");
			
			for (int y = 0; y < 3; y++) { // inner loop
				System.out.println("Bye");
			}
		}

		System.out.println("--------------MORE EXAMPLES----------------");
		
		for (int i = 10; i <= 14; i++) {
			System.out.println(i);
			for (int j = 1; j <= 4; j++) {
				System.out.println(j);
			}
		}
		
		System.out.println("-----------------how can I print numbers from 10 to 99 using nested loop---------");
		
		for (int i = 1; i <= 9; i++) {
			
			for (int a = 0; a <= 9; a++) {
				System.out.println(i+""+a);
			}
			
			
		}
		System.out.println("-----------------How can I print clock---------------");
		
		for (int h = 0; h < 24; h++) {
			
			for (int m = 0; m < 60; m++) {
				if (h < 10) {
					if (m < 10) {
					System.out.println("0" + h + ":0" + m);
					} else {
						
						System.out.println("O" + h + ":" + m);
						}
				} 
				 else {
					if (m < 10) {
					System.out.println(h + ":0" + m);
						} else {
					System.out.println(h + ":" + m);
				}
			}
		
	}

	}
}
}

