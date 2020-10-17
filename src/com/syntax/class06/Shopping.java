package com.syntax.class06;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String sale;
		double price, discount, finalPrice;

		System.out.println("Does the store have the sale?");

		sale = s.nextLine();

		if (sale.equalsIgnoreCase("Yes")) {
			System.out.println("I am going to shopping right now");
			System.out.println("What is the price for the product you are interested in");
			price = s.nextDouble();
			if (price >= 10 && price < 50) {
				discount = 0.1;
				finalPrice = price - (price * discount);
			
			} else if (price >= 50 && price < 100) {
				discount = 0.2;
				finalPrice = price - (price * discount);

			} else if (price >= 100 && price < 500) {
				discount = 0.4;
				finalPrice = price - (price * discount);
			} else if (price >= 500) {
				discount = 0.5;
				finalPrice = price - (price * discount);
			} else {
				discount = 0;
				finalPrice = price - (price * discount);
			}
			System.out.println("Your final price is " + finalPrice);

		} else {
			System.out.println("I am not going to shopping");
		}

	}

}
