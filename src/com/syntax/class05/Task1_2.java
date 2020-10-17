package com.syntax.class05;

import java.util.Scanner;

public class Task1_2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Please enter todays day using numbers only");
		int day = s.nextInt();
		
		if (day >= 1 && day <=5) {
			System.out.println("It is a weekday.");
		} else if (day == 6 || day == 7) {
			System.out.println("It is a weekend.");
		} else {
			System.out.println("Invalid day");
		}
		

	}

}
