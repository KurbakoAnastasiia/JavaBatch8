package com.syntax.class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double num1, num2, result;
		char operator;
		
		
		System.out.println("Please enter two numbers");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		System.out.println("Please enter an operator (+, -, *, /)");
		operator = sc.next().charAt(0);
		result = 0;
		switch (operator) {
		
		case '+':
			result = num1 + num2;
			break;	
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
			default:
				System.out.println("Please enter valid information");
				break;
		}
		if (result != 0) {
		System.out.println(result);
		}
	}

}
