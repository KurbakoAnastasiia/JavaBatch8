package com.syntax.class04;

public class DegreeProgram {

	public static void main(String[] args) {
		
		boolean diploma = true;
		double score = 3.3;
		
		if (diploma) {
			System.out.println("Congratulations!!!!");
			if (score >= 3.5) {
				System.out.println("You are eligible for scholarship.");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("You can get a degree!");
			
		}

	}

}
