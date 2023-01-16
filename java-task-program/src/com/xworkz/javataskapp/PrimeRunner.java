package com.xworkz.javataskapp;

import java.util.Scanner;

public class PrimeRunner {
	
	 public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
		 
		 System.out.println("Enter a Number :");
		 
		 int inputNumber =sc.nextInt();
		 
		 boolean isItPrime = checkForPrimeNumber(inputNumber);
		 
		 if(isItPrime) {
			 System.out.println("is a prime number :"+inputNumber);
		 }
		 else {
			 System.out.println("is not a prime number :"+inputNumber);
			 
		 }
		 sc.close();
	}

	private static boolean checkForPrimeNumber(int inputNumber) {
		// TODO Auto-generated method stub
		return false;
	}

}
