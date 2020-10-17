package com.syntax.class05;

import java.util.Scanner;

public class HWComission {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		double sales, comission;
		System.out.println("Please enter the amount of sales");
		sales = s.nextDouble();
		
		if (sales >= 10 && sales < 100) {
			comission = (sales * 10) / 100;
		} else if (sales >= 100 && sales < 200) {
			comission = (sales * 20) / 100;
		} else if (sales >= 200 && sales < 500) {
		    comission = (sales * 30) / 100;
		} else if (sales >= 500) {
		    comission = (sales * 50) / 100;
		} else {
			comission = 0;
		}
System.out.println("The comission is " + comission);
	}

}
