package com.xworkz.tostringapp;

public class StringCounting {
	
	/* without using length method*/
	public static void main(String[] args) {
		
		String a="Bangalorecity";
		
		//To count no of Charector 
		int count=0;
		
		// converting Array to ToCharactor Array
		char arr[]=a.toCharArray();
		
		// count the no of for each loop
		for(char i:arr) {
			count++;
			
		}
		// printing the all charactor
		System.out.print(count);
		
	}

}
