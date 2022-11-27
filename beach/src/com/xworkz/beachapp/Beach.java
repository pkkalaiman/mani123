package com.xworkz.beachapp;

public class Beach {

	
	private String name;
	private String address;
	private String id;
	private long phoneNo;
	private int rupees;
	private float travellingCharge;
	private double entryFee;
	private char grade;
	
	
	
	public void setName(String nam) {
		 name=nam;
	}
	
	public String getName() {
		return name;
	}
	
	

	public void setAddress(String addr) {
		address=addr;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	
	
	public void setId(String ide) {
		id=ide;	
	}
	
	public String getid() {
		return id;
	}
	
	
	
	public void setPhoneNo(long no) {
		phoneNo=no;
	}
	
	public long getPhoneNo() {
		return phoneNo;
	}
	
	
	 
	public void setRupees(int rupee) {
		 rupees=rupee;
		
	}
	public int getRupees() {
		return rupees;
	}
	
	
	public void setTravellingCharge(float travelling) {
		travellingCharge=travelling;
		
	}
	public float getTravellingCharge() {
		return travellingCharge;
	}
	
	
	public void setEntryFee(double fee) {
		entryFee=fee;
		
	}
	public double getentryFee() {
		return entryFee;
	}
	
	
	public void setGrade(char gra) {
		grade=gra;
		
	}
	
	public char getGrade() {
		return grade;
	}
	
	
}

