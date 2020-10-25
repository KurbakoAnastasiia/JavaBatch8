package com.syntax.review03;

public class Patterns {

	public static void main(String[] args) {
		
		            // $$$$
					// $$$$
					// $$$$
					// $$$$
					
					for (int i = 1; i <= 4; i++) {
						
						for (int j = 1; j <= 4; j++) {

				System.out.print("$");
					}
						System.out.println();
	}
					
					for (int i = 1; i <= 7; i++) {
						for (int j = 1; j <= i; j++) {
							System.out.print(j + " ");
						}
							System.out.println();
					}
					
					System.out.println("-----------------------------------");
					 for (int i = 1; i <= 15; i++) {
					      for (int j = 1; j <= 8-i; j++) {
					    	  
					    	  System.out.print(j + " ");
					      }
					  	
					      for (int k = 1; k <= i - 7; k++) {
					    	 
					    	  System.out.print(k + " ");
					      }
					  	System.out.println();
					    }
					 
					
					    }
}
