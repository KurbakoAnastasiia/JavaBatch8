package com.syntax.class10;

public class HW3 {

	public static void main(String[] args) {
		/* Create an array of countries. 
		 * While retrieving all values from an array print capital for each country. 
		 * (use 2 different loops).
		 */

		String[] countries = new String[6];
		countries[0] = "Russia";
		countries[1] = "USA";
		countries[2] = "Finland";
		countries[3] = "Germany";
		countries[4] = "France";
		countries[5] = "Spain";
		String capital;
		
		System.out.println("------------------------1st loop------------------------");
		for (int i = 0; i < countries.length; i++) {
			
			switch(countries[i]) {
			case "Russia":
				capital = "Moscow";
				break;
			case "USA":
				capital = "Washington";
				break;
			case "Finland":
				capital = "Helsinki";
				break;
			case "Germany":
				capital = "Berlin";
				break;
			case "France":
				capital = "Paris";
				break;
			case "Spain":
				capital = "Madrid";
				break;
			default:
				capital = null;
				
			}
			System.out.println(capital);
		}
		
		System.out.println("----------------------------2nd loop----------------------------------");
		int i = 0;
		while (i < countries.length) {
			if ("Russia".equals(countries[i])) {
				capital = "Moscow";
			} else if ("USA".equals(countries[i])) {
				capital = "Washington";
			} else if ("Finland".equals(countries[i])) {
				capital = "Helsinki";
			} else if ("Germany".equals(countries[i])) {
				capital = "Berlin";
			} else if ("France".equals(countries[i])) {
				capital = "Paris";
			} else if ("Spain".equals(countries[i])) {
				capital = "Madrid";
			} else {
				capital = null;
			}
			System.out.println(capital);
			
			i++;
			}
		}
	}


