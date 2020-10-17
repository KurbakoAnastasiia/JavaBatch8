package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
	Scanner s = new Scanner (System.in);
	System.out.println("Enter person's height");
	int h = s.nextInt();
	
	if (h < 60) {
		System.out.println("This person is short");
	} else if (h >= 60 && h < 72) {
		System.out.println("This person is medium");
	} else {
		System.out.println("This person is tall");
	}

	}

}
