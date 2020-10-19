package com.syntax.class08;

public class Task {

	public static void main(String[] args) {
		
		System.out.println("-----------Task 1---------------");
		for (int a = 1; a <= 100; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("-----------Task 2---------------");
		for (int b = 100; b > 0; b--) {
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.println("-----------Task 3 Way 1---------------");
		for (int c = 20; c > 0; c-=2) {
			System.out.print(c +" ");
		}
		System.out.println();
		System.out.println("-----------Task 3 Way 2---------------");
		for (int d = 20; d > 0; d--) {
			if (d%2 == 0) {
				System.out.print(d + " ");
			}
		}
		System.out.println();
		System.out.println("-----------Task 4 Way 1---------------");
		for (int e = 21; e < 50; e+=2) {
			System.out.print(e +" ");
		}
		System.out.println();
		System.out.println("-----------Task 4 Way 2---------------");
		for (int f = 21; f < 50; f++) {
			if (f%2 != 0) {
				System.out.print(f + " ");
		
	}
	
}
	int sum = 0;
	for (int i = 1; i < 6; i++) {
		sum = sum + i;
	}
	System.out.println();
	System.out.println("--------------------------");
	
		System.out.println(sum);
		
		int x;
		for (x = 1; x < 6; x++) {
			System.out.println("Value for x inside the loop " + x);
		}
		System.out.println("Value for x outside of for loop " + x);
		
	   System.out.println("______________what will be the output__________________");
	   
	   int result = 1;
	   for (int n = 10; n >= 1; n-=2) {
		   result *= n;
		   System.out.println("Result = " + result);
	   }
	   System.out.println(result);
	   
}
}
