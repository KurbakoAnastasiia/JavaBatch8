package com.syntax.class04;

public class Mortgage {

	public static void main(String[] args) {
		
		double rate = 2.5;
		int price = 300000;
		
		if (rate > 4.5) {
			System.out.println("Sorry, I will not buy a house");
		} else {
			System.out.println("I will consider buying");
		if (price > 200000) {
			System.out.println("I need to take a loan");
		} else {
			System.out.println("I will pay cash");
		}
		}

	}

}
