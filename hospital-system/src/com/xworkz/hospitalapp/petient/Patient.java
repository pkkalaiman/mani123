package com.xworkz.hospitalapp.petient;

import com.xworkz.hospitalapp.Gender;

public class Patient {
	
	public String patientName ;
	public String adress ;
	public  Gender gender ;
	public int age;
	public String address;
	
	public Patient( String patientName, String adress, Gender gender) {
		
		
	    this.patientName = patientName;  
		this.adress = adress;
		this.gender = gender;
	
	}

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public void displayInfo() {
		
		
		System.out.println("patient name is : "+ patientName);
		System.out.println("patient adress is : "+ adress);
		System.out.println("patient gender is : "+ gender);
		
	}

}
