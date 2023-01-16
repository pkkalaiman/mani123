package com.xworkz.comparableapp;

public class Student implements Comparable<Student> {

	
	private String name;
	private int id;
	
	Student(String name, int id){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "name :"+name + " "+ "id :" +id;
	}
//	@Override
//	public int compareTo(Student st) {
//		return this.id - st.id;
//	}
	
	@Override
	public int compareTo(Student st) {
		return this.name.compareTo(st.name);
	}
}
