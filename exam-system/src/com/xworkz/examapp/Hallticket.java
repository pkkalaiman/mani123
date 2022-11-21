package com.xworkz.examapp;

public class Hallticket {
	
	private String candidatesName;
	private String subjectName[];
	private String usnNo;
	private String universityName;
	
	
	public Hallticket(String candidatesName, String usnNo, String subjectName[], String usnName, String universityName) {
		
		System.out.println("hallticke object is created");
		
		this.candidatesName=candidatesName;
		this.subjectName=subjectName;
		this.usnNo=usnNo;
		this.universityName=universityName;	
		
	}

	public void displayDetiails() {
		System.out.println("candidate Name:"+this.candidatesName);
		System.out.println("subject Name:"+this.subjectName);
		System.out.println("university Name:"+this.universityName);
		System.out.println("usnNo is created:"+this.usnNo);
		System.out.println("List of subject exam to be give by the candidate");
		
		
		for(int i=0;i<subjectName.length;i++) {
			
			System.out.println(subjectName[i]);
		}
		
	}
}
