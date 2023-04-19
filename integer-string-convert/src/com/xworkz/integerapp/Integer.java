package com.xworkz.integerapp;

public class Integer {
	
	public static void main(String[] args) {
		
		int a = 1234;
		int b = -1234;
		
		
		String str1 = Integer.toString(a);
		String str2 = Integer.toString(b);
		
		
		System.out.println("String str="+ str1);
		System.out.println("String str2=" +str2);
		
		
	}

	private static String toString(int a) {
		System.out.println("Converting Integer to String");
		return  "convert String";
	}

}
