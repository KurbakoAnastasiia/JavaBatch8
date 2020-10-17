package com.syntax.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double num1, num2, num3, max;

		System.out.println("Enter 3 doubles numbers: ");
		num1 = s.nextDouble();
		num2 = s.nextDouble();
		num3 = s.nextDouble();
		s.close();

		// 1st way

		if (!(num1 == num2 && num2 == num3)) {
		
		if (num1 > num2 && num1 > num3) {
			max = num1;
		} else if (num2 > num3) {
			max = num2;
		} else {
			max = num3;
		
		} System.out.println(max);
		} else  {
			System.out.println("Numbers are equal");
		}
		
		System.out.println("--------------   Comparing 2 numbers using nested if   ------------");
		// 2nd way
		double biggest;
		
		if (num1 > num2) {
			if (num1 > num3) {
				biggest = num1;
		} else {
			biggest = num3;
		}
		} else {
			if (num2 > num3) {
				biggest = num2;
			} else {
				biggest = num3;

			}
		}
		System.out.println("The largest number is " + biggest);
		
	}

}
