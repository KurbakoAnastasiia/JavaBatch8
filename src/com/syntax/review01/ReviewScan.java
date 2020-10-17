package com.syntax.review01;

import java.util.Scanner;

public class ReviewScan {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner (System.in);
		System.out.println("Please enter 3 distinct numbers");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
			  	
			  	
	if (num1 >= num2) {
	if (num1 >= num3) {
		System.out.println("The gratest number is " + num1);
	}	
 } 
 if (num2 >= num3) {
	 if (num2 >= num1) {    
	 System.out.println("The gratest number is " + num2); 
	 }
	 
        } else {
System.out.println("The gratest number is "+ num3);

	}
	}
}
