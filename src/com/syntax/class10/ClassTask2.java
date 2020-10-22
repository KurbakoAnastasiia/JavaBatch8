package com.syntax.class10;

public class ClassTask2 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Print all values from
		// the array.

		String[] cars = new String[6];
		cars[0] = "BMW";
		cars[1] = "Mercedes";
		cars[2] = "Toyota";
		cars[3] = "Honda";
		cars[4] = "Audi";
		cars[5] = "Jeep";

		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println("---------------------------");
		System.out.println("getting values from array using enhanced for loop");

		/*
		 * for (DataType: name of the array
		 */
		for (String car : cars) {

			System.out.print(car + " ");
		}
		System.out.println("---------------------------");
		System.out.println("getting values from array using enhanced for loop");

		int[] numbers = {10, 10, 90, 600, 89};
		
		for (int num : numbers) {
			System.out.println(num);
		}
		
		System.out.println("---------------------------");
		System.out.println("getting values from array using enhanced for loop");
		
		boolean[] arrayOfBoolean = {true, true, false, true};
		for (boolean boo : arrayOfBoolean) {
			System.out.println(boo);
		}
	}

}
