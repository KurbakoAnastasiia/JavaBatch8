package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * lets ask a tester on witch browser they would like to use
		 * 
		 * 
		 * 
		 */

		Scanner scan;
		String browser, message;
	
		scan = new Scanner (System.in);
		System.out.println("Please enter a browser");
		browser = scan.nextLine();
		
		switch(browser.toLowerCase()) {
		
		case "safari":
			message = "You code will be executed on Safari browser";
			break;
		case "chrome":
			message = "You code will be executed on Chrome browser";
            break;
		case "firefox":
			message = "You code will be executed on Firefox browser";
            break;
		default:
			message = "Entered browser is not supported";
	
		}
		System.out.println(message);
	}

}
