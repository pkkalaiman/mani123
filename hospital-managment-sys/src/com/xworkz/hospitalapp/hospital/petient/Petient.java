package com.xworkz.hospitalapp.hospital.petient;

import com.xworkz.hospitalapp.Gender;

public class Petient {
	
	public String patientName ;
	public String adress ;
	public  Gender gender ;
	
	public void Patient( String patientName, String adress, Gender gender) {
		
		
	      this.patientName = patientName;
	      
		this.adress = adress;
		this.gender = gender;
		
		
		
	}

	public void displayInfo() {
		
		
		System.out.println("patient name is : "+ patientName);
		System.out.println("patient adress is : "+ adress);
		System.out.println("patient gender is : "+ gender);
		
	}

}


