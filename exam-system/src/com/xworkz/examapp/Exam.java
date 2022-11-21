package com.xworkz.examapp;

public class Exam {
	
	Hallticket hallticket;
	public int fees;
	
	public boolean allow(Hallticket hallticket) {
		boolean isAllowed = false;
		
		System.out.println("inside allow method");
		System.out.println("the fees is paid is :"+this.fees);
		if(fees>=1200);
		System.out.println("fees is paid");
		
		if(hallticket!=null) {
			
	//this is called in inizalaisation
			
			this.hallticket=hallticket;
			
			System.out.println("detials of candidates Halltickets");
			
			this.hallticket.displayDetiails();
			
			isAllowed=true;
			
			System.out.println("Hallticket is been issued:now");
			
		}
		
		else {
			System.out.println("No Hallticket is found");
		}
		return isAllowed;
		
	}
	

}
