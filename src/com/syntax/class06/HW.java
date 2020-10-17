package com.syntax.class06;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {

		 Scanner scan;
		  String country, language;
		  scan = new Scanner (System.in);
		  System.out.println("Please enter the name of your country");
		  country = scan.nextLine();
		  language = null;
		 switch (country.toLowerCase()) {
		 case "usa":
			 language = "English";
			 break;
		 case "russia":
			 language = "Russian";
			 break;
		 case "germany":
			 language = "German";
			 break;
		 case "italy":
			 language = "Italian";
			 break;
		 case "spain":
			 language = "Spanish";
			 break;
		 case "france":
			 language = "French";
			 break;
		 case "mexico":
			 language = "Spain";
			 break;
		 case "finland":
			 language = "Finish";
			 break;
		 case "china":
			 language = "Chinese";
			 break;
		 default:
			System.out.println("I don't know what language you speak"); 
			
		 break;
		  } 
		 if (language != null) {
		 System.out.println("You speak " + language);
		 }
	}
}
