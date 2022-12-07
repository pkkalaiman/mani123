package com.xworkz.hospitalapp.hospital.patient;

import com.xworkz.hospitalapp.hospital.Gender.Gender;

public class Patient {
	
	//Grouping data into single block as called as Encapsulation;
	
	private String name;
	private int age;
	private Gender gender;
	private String address;
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public Gender getGender() {
		return gender;
	}
	
	
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
	public String getAddress() {
		return address;
	}
	
	
	
	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	
	public Patient(String name, int age,Gender gender, String address) {
		this.name=name;
		this.age =age;
		this.address =address;
		
		
	}
	
	
	
	
	public void displayInfo() {
		System.out.println("patient Name:"+name);
		System.out.println("patient age:"+age);
		System.out.println("patient gender :"+gender);
		System.out.println("patient address :"+address);
	}
	
	

}
