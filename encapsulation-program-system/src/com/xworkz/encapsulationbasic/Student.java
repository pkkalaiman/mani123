package com.xworkz.encapsulationbasic;

public class Student { // First step */ Using Non Abstract Class

	// Second Step */ Using Private Variable
	private int id;
	private String name;
	private double Salary;
	private int noOfWorking;

	// third Step */ Using Getter & Setter Method

	public void setId(int id) {    // you complete the three Step you Have Achieve the Encapsulation
		if (id > 0) {
			this.id = id;                 
			System.out.println("Id is Valid");
		} else {
			System.out.println("Id IS Invalid");
		}
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setsalary(double salary) {

		if (salary > 10000) {
			this.Salary = salary;
			System.out.println("Salary is valid in Experience");
		} else {
			System.out.println("IS Not Valid in Expierience");
		}
	}

	public double getSalary() {
		return Salary;
	}

	public void setNoOfWorking(int noOfWorking) {
		this.noOfWorking = noOfWorking;
	}

	public int getnoOfWorking() {
		return noOfWorking;
	}
}
