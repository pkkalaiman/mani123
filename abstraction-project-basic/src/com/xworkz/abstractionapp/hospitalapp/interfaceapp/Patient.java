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




	public Patient(String name, String age, Gender gender, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}




	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}




	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}




	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}




	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
