package com.xworkz.ifelseifapp;

public class Demo {
	
	public static void main(String[] args) {
		
		int marks=35;
		
		
		
		if(marks>=50 && marks<=100) {
			System.out.println("First Class ");
		
		}	else if(marks>=35 && marks<=49) {
			System.out.println("Second Class Mark");
		}
			else if (marks>=0 && marks<=100){
			System.out.println("Fail...(");
		}
			else {
				System.out.println("Invalid Marks");
			}
		
		
	}

}
