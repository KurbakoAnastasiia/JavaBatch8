package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		char grade;
		
		System.out.println("Please enter your grade A, B, C or D");
		
		grade = s.next().charAt(0);
		
		String message;
		
		switch (grade) {
		
		case 'A':
			message = "Excellent";
			break;
		case 'B':
			message = "Good";
			break;
		case 'C':
			message = "Average";
			break;
		case 'D':
			message = "Bad";
			break;
		default:
			message = "Not Acceptable";
			
		}
		System.out.println("You have " + message + " grade ");
	}

}
