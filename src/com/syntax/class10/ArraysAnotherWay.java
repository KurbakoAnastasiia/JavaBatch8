package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {
		
		String[] names = {"Mike", "Burju", "Jack", "Danilo", "Bryan", "Evgeniya"};
		
		// String[] name;
		// name = {"Sabeen"}; we can not do it in 2 steps this way
		
		System.out.println(names[3]);
		
		// how do I know how many elements I have in the array?
		
		int size = names.length;
		System.out.println("Size of names array = " + size);
		
		System.out.println(names[names.length-2]);
		
		int i = 2;
		System.out.println(names[i]);
		
		i += 2;
		System.out.println(names[i]);
		
		System.out.println("----------------------------------------");
		for (int a = 0; a < names.length; a++) {
			
			System.out.println(names[a]);
		}
		
		System.out.println("----------------------------------------");
		for (int b = 0; b <= names.length - 1; b++) {
			
			System.out.println(names[b]);
		}
		// for (int b = 0; b <= names.length - 1; b++) { we will get an exception because length will be 6 
		// and highest index  will have 5
		// System.out.println(names[b]);
	}
		
	}


