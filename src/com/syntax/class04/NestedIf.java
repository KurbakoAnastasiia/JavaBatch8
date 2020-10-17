package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		/*
		 * variable for allergy - yes or no -->
		 *                                  we will check if pet allergy
		 *                                                if peanut allergy
		 *                                                if pollen allergy
		 */

		boolean allergy = true;
		boolean petAllergy = true;
		boolean peanutAllergy = true;
		boolean pollenAllergy = false;
		
		if (allergy) {
			System.out.println("Lets do futher check");
			
			if (petAllergy) {
				System.out.println("Please no cats or dogs on the house");
			} else {
				System.out.println("That is good you do not have pet allergy");
			}
		} else {
				System.out.println("You are lucky");
			} 
		
		System.out.println("-------------EXAMPLE 2----------------");
		
		/*
		 * if today is Friday we will watch movie but would like to check the date
		 *                if date is 13 --> watching scary movie
		 *                and if it is not --> I will watch comedy, action
		 * if no Friday --> I am studying                
		 */
		
		boolean isFriday = true;
		int date = 14;
		boolean monday = true;

		
		if (isFriday) {
			if (date == 13) {
				System.out.println("I will watch scary movie");
			} else {
			System.out.println("I will watch PK movie with Amir Khan");
			}
		} else {
			if (monday) {
				System.out.println("I am not studying, I am working");
			} else {
			System.out.println("I have class at Syntax");
		}
		
		}
		System.out.println("-------------EXAMPLE 3----------------");
		
		/*
		 * check if assignment is completed
		 * if assignment is completed :
		 *              if score > 90 --> great job
		 *              if score > 80 --> good job 
		 *              if score > 70 --> please study more
		 */
		
		int score = 65;
		boolean assignment = true;
		
		if (assignment) {
			if (score > 90) {
				System.out.println("You did great!!!!");
			} else if (score > 80) {
				System.out.println("You did good!");
			} else if (score > 70) {
				System.out.println("Probably you need to study more");
			} else {
				System.out.println("Good job for trying but you must study more");
			}
			
		} else {
			System.out.println("You should always complete all assignments");
		}
		
		
	}

}
