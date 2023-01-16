package com.xworkz.comparableapp;

public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	@Override
	public String toString() {
		return "id :"+id+ " " +"name :"+name+" "+"salary :"+salary;
	}
//	@Override
//	public int compareTo(Employee e) {
//		return (int) (this.salary - e.salary);
//	}
	
//	@Override
//	public int compareTo(Employee e) {
//		return this.name.compareTo(e.name);
//	}
	@Override
	public int compareTo(Employee e) {
		
		return this.id - e.id;
	}
	
}