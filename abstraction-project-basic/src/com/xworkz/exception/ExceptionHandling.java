package com.xworkz.exception;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		int a=23;
		int b=0;
		
		//System.out.println(a/b);
		
		// handaling Exception
		
		/*
		 * try { System.out.println(a/b); } catch(ArithmeticException A) {
		 * A.printStackTrace(); }
		 */
		try {
			System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
