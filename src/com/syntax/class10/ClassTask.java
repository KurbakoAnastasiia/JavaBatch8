package com.syntax.class10;

public class ClassTask {

	public static void main(String[] args) {
		
		/* Task 1
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B (use 2 different ways of creating an array).
		 */
		char[] grade = new char[6];
		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';
		System.out.println(grade[1]);
		
		char[] grade2 = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.println(grade2[1]);
		
		/* Task 2
		 * Create an array of names and store all names of your group. 
		 * Then print your name from that array. (use 2 different ways of creating an array).
		 */
		String[] names = new String[127];
		names[0] = "Artem";
		names[1] = "Mike";
		names[2] = "Angela";
		names[3] = "Evgeniya";
		names[4] = "Sabeen";
		names[5] = "Danilo";
		names[6] = "Anastasiia";
		names[7] = "Marta";
		names[8] = "Rene";
		System.out.println(names[6]);
		
		String[] name = {"Artem", "Mike", "Angela", "Evgeniya", "Sabeen", "Danilo", "Anastasiia", "Marta", "Rene"};
		System.out.println(names[6]);
		
		/* Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: “Saturday is Java coding Day”.
		 */
		
		String[] words = {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);
	}

}
