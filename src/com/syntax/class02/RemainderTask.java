package com.syntax.class02;

public class RemainderTask {

	public static void main(String[] args) {
		
		int num1 = 5;
	    int num2 = 4;
	    int num3 = 3;
	    
	    int num4 = 7; 
	    int num5 = 10;
	    int num6 = 5;
	    
	    //start coding here
	    int sum=num1+num2;
	    int result1=sum-num3;
	    int mult=num4*num5;
	    int result2=mult/num6;
	    int blank3=result2%result1;

	    System.out.println(result2+" modded by "+result1+" is "+blank3);
	}

}
