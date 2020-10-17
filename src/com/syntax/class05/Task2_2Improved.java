package com.syntax.class05;

import java.util.Scanner;

public class Task2_2Improved {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
		
		String month, season;
		
		System.out.println("Please enter your birth month");
		
		month = scan.next();

		if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			season = "Summer";
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			season = "Fall";
		} else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
			season = "Winter";
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			season = "Spring";
		} else {
			System.out.println("Please enter valid name of month");
	        season = "not defined";
		}
		System.out.println("You were born in " + season);
	}

}
