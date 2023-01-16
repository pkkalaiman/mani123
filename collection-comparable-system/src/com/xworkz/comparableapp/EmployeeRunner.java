package com.xworkz.comparableapp;

import java.util.TreeSet;

public class EmployeeRunner {
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee(22, "mani", 85.98);
		Employee emp2=new Employee(26, "Sathis", 65.98);
		Employee emp3=new Employee(32, "Saravanan",52.98);
		Employee emp4=new Employee(24, "Dharshan", 56.98);

		TreeSet<Employee> emp=new TreeSet<Employee>();
		
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		
		for (Employee employee : emp) {
			
			System.out.println(employee);
		}
		
	}

}
