package com.syntax.class11;

public class LargestNumbers {

	public static void main(String[] args) {
	
		// I would likr to find largest number from array?
		int[] array = {10, 0, 20, 8, -1, 77, 56};
		int largest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] >= largest) {
				largest = array[i];
			}
			 
		} System.out.println("The largest number from an array is " + largest);

	}

}
