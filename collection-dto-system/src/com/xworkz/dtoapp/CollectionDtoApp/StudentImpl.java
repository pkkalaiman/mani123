package com.xworkz.dtoapp.CollectionDtoApp;

public class StudentImpl implements School {

	@Override
	public void writExam() {
		System.out.println("Student come to erite the Exam ");
	}

	@Override
	public void doSystem() {
		System.out.println("System Is Changing moment");
	}

}
