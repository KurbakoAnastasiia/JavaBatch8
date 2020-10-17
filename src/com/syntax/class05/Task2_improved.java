package com.syntax.class05;

import java.util.Scanner;

public class Task2_improved {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
		
		int quiz, midTerm, finalScore, avg;
		
		System.out.println("Please enter your quiz score");
		quiz = scan.nextInt();
		
		System.out.println("Please enter your mid term score");
		midTerm = scan.nextInt();
		
		System.out.println("Please enter your final score");
		finalScore = scan.nextInt();
		
		avg = (quiz + midTerm + finalScore) / 3;
		System.out.println(avg);
		
		char grade;

		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 70 && avg < 90) {
			grade = 'B';
		} else if (avg >= 50 && avg < 70) {
			grade = 'C';
		} else if (avg < 50 && avg >= 40) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade is = " + grade);

		if (grade == 'A' || grade == 'B') {
			System.out.println("You are good student");
		} else {
			System.out.println("Please study more");
		}
		
	}

}
