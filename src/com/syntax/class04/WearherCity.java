package com.syntax.class04;

import java.util.Scanner;

public class WearherCity {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Plese enter the name of city");
		
		String city = scan.nextLine();
		
		System.out.println("Please enter the temperature in Fahrenheit");
		
		int temp = scan.nextInt();
		
		int cels = (int)((temp - 32) / 1.8);
		
		System.out.println("The temperature is the city " + city + " is " + cels);
		
	}

}
