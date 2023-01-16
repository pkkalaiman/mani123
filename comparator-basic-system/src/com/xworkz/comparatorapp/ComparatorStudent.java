package com.xworkz.comparatorapp;

import java.util.Comparator;

public class ComparatorStudent implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		return a.id - b.id;
	}
	
	

}
