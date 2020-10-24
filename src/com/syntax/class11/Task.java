package com.syntax.class11;

public class Task {

	public static void main(String[] args) {
		/*Create a 2D array where you will store the following values: 
		 * Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		 * After storing values print the following:
		 * Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan
		 */
		

	
		String[][] names2 = {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
		};
		
			System.out.println(names2[0][1] + " " + names2[1][0]);
			System.out.println(names2[0][0] + " " + names2[1][3]);
			System.out.println(names2[0][2] + " " + names2[1][2]);
			System.out.println(names2[0][3] + " " + names2[1][1]);
			
			System.out.println("-----------------------");
		/*
		 * Create an array of cars : american, german, korean, italian. And print all values from a 2D array
		 */
		
			String[][] cars = {
					{"Jeep", "Ford", "Dodge"},
					{"BMW", "Mecedes", "Audi"},
					{"Kia", "Honda", "Huindai"},
					{"Fiat", "Ferrari", "Maserati", "Lamborghini"}
					
			};
			
			for (int i = 0; i < cars.length; i++) {
				for (int j = 0; j < cars[i].length; j++) {
				String car = cars[i][j];
				System.out.print(car + "      ");
				} 
				System.out.println();
			}
			System.out.println("----------------------------");
			
			 for (String[] carArray : cars) {
				 for (String car : carArray) {
					 System.out.print(car + "   ");
				 }
				 System.out.println();
			 }
	}

}
