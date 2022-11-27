package com.xworkz.restourentapp.restourent;

public class Restourent {
	
	
	public String name;
	public String id;
	public String address;
	public float manifacturing;
	public int age;
	public double foodName;
	public char travellingCharge;
	public long phoneNo;
	
	
	public void setname(String nam) {
		name=nam;	
	}
	
	public String getname() {
		return name;
		
	}
	
	public void setId(String Id) {
		Id=id;
	}
	
	public String getId() {
		return id;
		
	}
	
	public void setAddress(String addr) {
		address = addr;
		
	}
	public String getAddress(String addr) {
		return addr;
		
	}
	
	public void setAge(int ag) {
		age=ag;
		
	}
	
	public int getage() {
		
		return age;
	}
	
	public void setmanifacturing(float man) {
	 manifacturing = man;
		
	}
	
	public float getmanifacturing() {
		return manifacturing;
		
	}
	
	public void setfoodName(double food) {
		foodName = food;
		
	}
	
	public double getfoodName() {
		return foodName;
		
	}
	
	public void settravellingCharge(char travel) {
		travellingCharge = travel;
		
	}
	
	public char getbillingMethod() {
		return travellingCharge;
		
	}
	
	public void setphoneNo(long Phone) {
		phoneNo= Phone;
		
	}
	
	public long getphoneNo() {
		return phoneNo;
		
	}

}
