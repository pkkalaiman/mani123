package com.xworkz.userapp.user;

public class User {

	
	private String Name;
	private String id;
	private String address;
	private long phoneNo;
	private int rubiees;
	private double traveleCharge;
	private char grade;
	private float entryfees;
	
	
	public void setName(String nam) {
		Name=nam;
		
	}
	public String getName() {
		return Name;
		
	}
	
	public void setId(String Id) {
		Id=id;
		
	}
	
	public String getId() {
		return id;
		
	}
	
	public void setaddress(String addr) {
		address = addr;
		
	}
	
	public String getaddress() {
		return address;
		
	}
	
	public void setphoneNo(long No) {
		phoneNo = No;
		
	}
	
	public long getphoneNo() {
		return phoneNo;
		
	}
	
	public void setrubiees(int rubie) {
		rubiees = rubie;
		
	}
	
	public int getrubiees() {
		return rubiees;
		
	}
	
	public void settravelCharge(double travel) {
		traveleCharge = travel;
		
	}
	
	public double gettravelCharge() {
		return traveleCharge;
		
	}
	
	public void setGrade(char grad) {
		grade = grad;
		
	}
	
	public char getGrade() {
		return grade;
		
		
	}
	
	public void setentryfees(float entry) {
		entryfees = entry;
		
	}
	
	public float getentryfees() {
		return entryfees;
		
	}
}
