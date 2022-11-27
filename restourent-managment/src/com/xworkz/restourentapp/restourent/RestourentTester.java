package com.xworkz.restourentapp.restourent;

public class RestourentTester {
	
	public static void main(String[] args) {
		
		Restourent rest = new Restourent();
		rest.setAge(24);
		rest.setAddress("Nelmangala");
	    rest.setId("21ADR14");
	    rest.setphoneNo(9514839766l);
	    rest.setmanifacturing(445);
	    rest.setname("P K Mani");
	    rest.setfoodName(65989);
	    
	    
	    
	    System.out.println("age is :"+rest.getage());
	    System.out.println("manager address is :"+rest.getAddress("nelmangala"));
	    System.out.println("Id is created :"+rest.getId());
	    System.out.println("phone no is created:"+rest.getphoneNo());
	    System.out.println("creat in manifacturing:"+rest.getmanifacturing());
	    System.out.println("created to the name:"+rest.getname());
	    System.out.println("food name is:"+rest.getfoodName());
	    
	    
	    
		
	}

}
