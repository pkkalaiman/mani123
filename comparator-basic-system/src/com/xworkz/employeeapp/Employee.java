package com.xworkz.employeeapp;

public class Employee {

	String name;
	int id;
	double salary;

	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {

		return "name :" + name + " " +" "+ "Id :" + id + " " +" "+ "Slary :" + salary;
	}

}
