package com.xworkz.encapsulationapp.Ecapsulation2;

public class StudentTester extends StudentExam {
	
	
	public static void main(String[] args) {
		
		StudentExam s = new StudentExam();
		s.setName("Mani");    
	   
		System.out.println("Student name is :"+s.getName());
		
		s.setRollNo(6565);
		
		System.out.println("Student Roll No is : "+s.getRollNo());
		
		s.setSubjectName("Chemistry");
		System.out.println("Subject Name Is :"+s.subjectName);
	}

}
