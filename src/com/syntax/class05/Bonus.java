package com.syntax.class05;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int workYears;
		double salary;
		
		System.out.println("Please enter numbers of worked years: ");
		
		workYears = scan.nextInt();
		
		if (workYears >= 5) {
			System.out.println("Yoa are eligible for bonus");
			System.out.println("Please enter your annual salary: ");
			salary = scan.nextDouble();
			if (salary > 50000) {
				System.out.println("Your bonus is $5000");
			} else {
				System.out.println("Your bonus is $3000");
			}
		} else {
			System.out.println("You are not eligible for bonus");
		}
		
	}

}
