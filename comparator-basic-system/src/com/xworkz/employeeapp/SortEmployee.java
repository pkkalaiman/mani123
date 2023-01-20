package com.xworkz.employeeapp;

import java.util.TreeSet;

public class SortEmployee {

	public static void main(String[] args) {

		Employee emp1 = new Employee("mani", 45, 87445.85);
		Employee emp2 = new Employee("Sangeeth", 75, 94756.85);
		Employee emp3 = new Employee("Ganesh", 85, 76950.85);
		Employee emp4 = new Employee("Harish", 43, 87596.85);

		ComparatorEmployee soft = new ComparatorEmployee();

		TreeSet<Employee> set = new TreeSet<Employee>(soft);

		set.add(emp4);
		set.add(emp3);
		set.add(emp2);
		set.add(emp1);

		for (Employee emp : set) {
			System.out.println(emp);
		}

	}
}
