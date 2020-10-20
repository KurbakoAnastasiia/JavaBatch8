package com.syntax.class08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		/* Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money accumulate the amount and tell the user how much is left to pay off. 
		 * If user give more money program should return a change. 
		 * Whenever a user done with payments program should say “Thank you for shopping!”
		 */

		Scanner scan = new Scanner(System.in);
		String item;
		double price, money, money1, extra;
		
		System.out.println("Plese enter what item woild you like to buy");
		item = scan.nextLine();
		
		System.out.println("What is the price of this item?");
		price = scan.nextDouble();
		
		System.out.println("Please enter money");
		money = scan.nextDouble();
		
			while (money != price) {
			if (money < price) {
				extra = price - money;
				System.out.println("Please insert more " + extra + "$");
				money1 = scan.nextDouble();
				money += money1;
			} else {
				extra = money - price;
				System.out.println("Please take your change " + extra + "$");
			 break;
			}
		} 
		System.out.println("Thank you for shopping");
	}

}
