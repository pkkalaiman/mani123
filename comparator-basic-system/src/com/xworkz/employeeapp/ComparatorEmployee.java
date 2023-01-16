package com.xworkz.employeeapp;

import java.util.Comparator;

public class ComparatorEmployee implements Comparator<Employee>{
	

	@Override
	public int compare(Employee a, Employee b) {
		return a.id - b.id;
	}

	

}
