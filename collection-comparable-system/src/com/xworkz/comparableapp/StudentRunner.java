package com.xworkz.comparableapp;

import java.util.TreeSet;

public class StudentRunner {

	public static void main(String[] args) {
		
		Student st1=new Student("Mani", 28);
		Student st2=new Student("Sangeeth", 85);
		Student st3=new Student("Abishek", 58);
		Student st4=new Student("ManiGandan", 42);
		
	
	
	TreeSet<Student> st=new TreeSet<Student>();
		
	st.add(st4);
	st.add(st3);
	st.add(st2);
	st.add(st1);
	
	for (Student student : st) {
		System.out.println(student);
	}
	
	}
}
