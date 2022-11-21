package com.xworkz.examapp;

import com.xworkz.examapp.supplementary.SupplymentaryExam;

public class HallticketTester {
	public static void main(String[] args) {
		
		String subjectName[]= {"Chemistry", "Physics", "English", "M1"};
		
		Hallticket hall=new Hallticket("Mani", "subjectName", subjectName, "15UCH4052ch", "Periyar University");
		//this is object
		Exam ex=new Exam();
		ex.fees=1200;
		ex.allow(hall);
		
		String hallTicket[] = {"Chemiustry" , "main", "suthagar"};
		SupplymentaryExam exam1=new SupplymentaryExam(2);
		exam1.fees=1300;
	    exam1.allow(hall);
	    
		
		
		
		
	
		
		
		
	}

}
