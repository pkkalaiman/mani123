package com.xworkz.studentapp;

import java.util.ArrayList;

public class StudentMain {
	
	public static void main(String[] args) {
		
		StudentClass emp1=new StudentClass("MANI   ", 22,   98.56, 768598486 );
		StudentClass emp2=new StudentClass("Sambath",  23,  78.67, 23456789);
		StudentClass emp3=new StudentClass("Bharatthi", 21, 67.87, 976438547);
		
		
		ArrayList<StudentClass> arry=new ArrayList<StudentClass>();
		
		arry.add(emp3);
		arry.add(emp2);
		arry.add(emp1);
		

		
		// this forEach() Loop
		for(StudentClass st : arry) {
			 
			System.out.println(st);
		}
		
		System.out.println("================");
		
		/*
		 * // this for() Loop
		 * 
		 * for(int i=0;i<arry.size();i++) { System.out.println(arry.get(i)); }
		 * 
		 */		System.out.println("============");
		 
		 boolean equals=emp1.equals(emp2);  // One class to another Class convert in object
		 
		 System.out.println(equals);
		 
		 boolean equals1=emp2.equals(emp3);
		 
		 System.out.println(equals1);
		
		
	}

}
