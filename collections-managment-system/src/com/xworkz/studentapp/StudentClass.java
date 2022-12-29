package com.xworkz.studentapp;

public class StudentClass {
	
	private String name;
	private int age;
	private double percentage;
	private int contactNo;
	
	
	 StudentClass(String name, int age, double percentage, int contactNo) {
		
		this.name=name;
		this.age=age;
		this.contactNo=contactNo;
		this.percentage=percentage;
		
		
	}
	

	@Override
	public String toString() {
		
		return ("name :"+name +" "+  "age :"+  age +"  "+  "contactNo :"+ contactNo  +"  "+ "percentage :"+percentage);
	}

	
	@Override
	public boolean equals(Object reference) {
		
		System.out.println("running equls from StudentClass");
		
		if(reference !=null) {
			
		  if (reference instanceof StudentClass) {
						
			StudentClass st=(StudentClass) reference;
			
			if(st.name.equals(name)) {
				System.out.println("Ending equals for StudentClass");
				
				return true;
			}
		}
	}
		return true;
	}
}
