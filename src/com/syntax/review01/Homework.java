package com.syntax.review01;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		  	Scanner inp = new Scanner(System.in);
		  	System.out.print("In:");
		  	String name = inp.nextLine();
		  	//DO NOT CHANGE ABOVE CODE!  Write your code below
		  	
		  	String teacher = "Chen";
		  	
		  	if (name.equals(teacher)) {
		  	  System.out.println("teacher");
		  	} else {
		  	  System.out.println("student");
		  	  
		  	}
		  	
		  }

	}

