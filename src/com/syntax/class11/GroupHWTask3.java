package com.syntax.class11;

public class GroupHWTask3 {

	public static void main(String[] args) {
		
 
		int num1, num2, num3;
	 num1 = 0;
	 num2 = 1; 
		System.out.print(num1 + " " + num2 + " ");
	 for (int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
			
		}

	}

}
