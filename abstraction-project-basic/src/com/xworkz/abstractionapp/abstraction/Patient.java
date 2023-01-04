package com.xworkz.abstractionapp.abstraction;

import com.xworkz.abstractionapp.hospitalapp.interfaceapp.Gender;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Patient {

	private String name;
	private int age;
	private Gender gender;
	private String address;
	
	
	public Patient(String name, int age, Gender gender, String address) {
			
		this.name=name;
		this.age=age;
		this.address=address;
		this.gender=gender;
		
	
	}


	public void displayInfo() {
		System.out.println("patient Name:"+name);
		System.out.println("patient age:"+age);
		System.out.println("patient gender :"+gender);
		System.out.println("patient address :"+address);
	}
}
