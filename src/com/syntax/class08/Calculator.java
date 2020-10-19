package com.syntax.class08;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Calculate sum of even and odd numbers from range 1 to 50
		
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 1; i <= 50; i++) {
			
			if (i%2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
		}
         System.out.println("The sum of even numbers from range 1 to 50 = " + sum1);
         System.out.println("The sum of odd numbers from range 1 to 50 = " + sum2);
         
         System.out.println("-------------------------------------------");
      /*
       *  I want to create a multiplication table
       *  1x1=1
       *  1x2=2
       *  1x3=3
       */
         
         Scanner scan = new Scanner(System.in);
         System.out.println("Please enter which number");
         
         int num1 = scan.nextInt();
         int mult;
         
         for (int a = 1; a <= 10; a++) {
        	 mult = num1 * a;
        	 System.out.println(num1 + " * " + a + " = " + mult);
         }
	}

}
