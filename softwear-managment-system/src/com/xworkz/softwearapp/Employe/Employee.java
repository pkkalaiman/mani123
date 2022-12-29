package com.xworkz.softwearapp.Employe;

import com.xworkz.softwearapp.Gender.Gender;

public class Employee {

	private String name;
	private int age;
	private String address;
	private Gender gender;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	public Employee(String name, int age,Gender gender, String address) {
		this.name=name;
		this.age =age;
		this.address =address;
		
		
	}
	
	
	public void displayInfo() {
		System.out.println("Employee Name:"+name);
		System.out.println("Employee age:"+age);
		System.out.println("Employee gender :"+gender);
		System.out.println("Employee address :"+address);
	}
	
}
