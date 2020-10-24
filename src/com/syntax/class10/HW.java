package com.syntax.class10;

public class HW {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array.

		int[] num = {10, 38, 78, 64, 55, 34};
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);
		
		int[] num1 = new int[10];
		num1[0] = 89;
		num1[1] = 54;
		num1[2] = 247;
		num1[3] = 85;
		num1[4] = 812;
		num1[5] = 23;
		
		int sum2 = 0;
		for (int a = 0; a < num1.length; a++) {
			sum2 = sum2 + num1[a];
		}
		System.out.println(sum2);
		
	}

}
