package com.xworkz.abstractionapp.hospitalapp.interfaceapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Patient {
	
	private String name;
	private String age;
	private Gender gender;
	private String address;
	
	
	public void displayInfo() {
		System.out.println("patient Name:"+name);
		System.out.println("patient age:"+age);
		System.out.println("patient gender :"+gender);
		System.out.println("patient address :"+address);
	}

}
