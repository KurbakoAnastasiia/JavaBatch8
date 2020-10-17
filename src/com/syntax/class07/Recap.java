package com.syntax.class07;

public class Recap {

	public static void main(String[] args) {
	
		String timeOfDay = "Noon";
		String day = "Saturday";
		
		switch (timeOfDay)  {
		
		case "Morning":
			System.out.print("Good Morning");
			
			switch (day) {
			case "Monday":
				System.out.println(" Colleagues!");
				break;
			case "Saturday":
				System.out.println(" Class!");
				break;
			case "Thursday":
				System.out.println(" Asghar!");
				break;
			}
			break;
		
		case "Noon":
			System.out.print("Good Afternoon");
			
			if (day.equals("Monday")) {
				System.out.println(" Colleagues!");
			} else if (day.equals("Saturday")) {
				System.out.println(" Class!");
			} else if (day.equals("Thursday")) {
				System.out.println(" Asghar!");
			}

		break;
		
		case "Evening":
			System.out.println("Good Evening");
		break;
		
		case "Night":
			System.out.println("Good Night");
		break;
		
		default:
			System.out.println("N/A");
		
		}
		
		
		

	}

}
