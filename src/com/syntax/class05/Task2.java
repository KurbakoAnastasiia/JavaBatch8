package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

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
		
		if (avg >= 90) {
			System.out.println("Grade = A");
		} else if (avg >= 70 && avg < 90) {
			System.out.println("Grade = B");
		} else if (avg >= 50 && avg < 70) {
			System.out.println("Grade = C");
		} else if (avg < 50 && avg >= 40) {
			System.out.println("Grade = D");
		} else {
			System.out.println("Grade = F");
		}
		// if you grate is A or B --> you a good student, you are studying a lot

	}

}
