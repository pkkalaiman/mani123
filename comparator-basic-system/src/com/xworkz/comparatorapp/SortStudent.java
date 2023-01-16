package com.xworkz.comparatorapp;

import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		
	
	Student st1=new Student(88,"Mani"); 
	Student st2=new Student(75,"Sathish");
	Student st3=new Student(45,"Dharani");
	
	ComparatorStudent soft=new ComparatorStudent();
	
	
	TreeSet<Student> tree=new TreeSet<Student>(soft);
	
	tree.add(st3);
	tree.add(st2);
	tree.add(st1);
	
	for (Student st : tree) {
		System.out.println(st);
	}
	
	}
}
