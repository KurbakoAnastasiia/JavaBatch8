package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		/*Write a program that reads a range of integers (start and end point), provided by a user and 
		 * then from that range prints the sum of the even and odd integers.
		 */

		Scanner scan = new Scanner(System.in);
		int start, end;
		int sumEven = 0, sumOdd = 0;
		System.out.println("Please enter starting point number");
		
		start = scan.nextInt();
		System.out.println("Please enter ending point number");
		end = scan.nextInt();
		
		for (int i = start; i <= end; i++) {
			
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
		System.out.println("The sum of the even integers = " + sumEven);
		System.out.println("The sum of the odd integers = " + sumOdd);
		}
		
	}

