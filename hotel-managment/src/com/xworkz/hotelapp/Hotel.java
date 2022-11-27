package com.xworkz.hotelapp;

public class Hotel {

	public String gstNo;
	public String name;
	public String address;
	public String staffNames[];
	public String staffContactNo[];
	public String foodNames[];
	public String billingMethods[];
	public int noOfSection[];
	
	public Hotel() {
		System.out.println("Hotel object is created");
		
	}
	public Hotel(String gstNo, String name, String address, String[] staffNames, String[] staffContactNo, String[] foodNames, String[] billingMethods, int[] noOfSection) {
		
		this.gstNo = gstNo;
		this.name = name;
		this.address = address;
		this.staffNames = staffNames;
		this.staffContactNo = staffContactNo;
		this.foodNames = foodNames;
		this.billingMethods =billingMethods;
		this.noOfSection =noOfSection;

	}
		
	public void displayInfo() {
		System.out.println("Medical shop name is"+name);
		System.out.println("====================");
		System.out.println("Medical shop get No is"+ gstNo);
		System.out.println("=================");
		System.out.println("Medical staff info");
		for(int i=0; i < staffNames.length; i++) {
				System.out.println(staffNames[1]);
					
	}
	
	System.out.println("Medical shop is created");
	System.out.println ("Medical staffs contect No");
	for(int i =0; i < staffContactNo.length; i++) {
			System.out.println(staffContactNo[1]);
	}
	
	System.out.println("===============");
	System.out.println("List of foodNames");
	for(int i =0; i <foodNames.length; i++) {
		System.out.println(foodNames[1]);
		
	}
			System.out.println("===============");
			System.out.println("Billing Methods");
			for(int i =0; i <foodNames.length; i++) {
				
				System.out.println(foodNames[1]);
				
			
			}
			
			

	}
	
}
	
	
	

