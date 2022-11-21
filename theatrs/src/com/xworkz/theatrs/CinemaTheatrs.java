package com.xworkz.theatrs;

public class CinemaTheatrs {

	public int id;
	public String name;
	public String location;
	public String managerName[]=new String [7];
	
	
	public CinemaTheatrs() {
		
		System.out.println("Cinema Theatrs object is created");
	
	}
	
	public CinemaTheatrs(int id , String name , String location , String[] managerName)
	{
		
		this();
		
		this.id=id;
		this.name=name;
		this.location=location;
		this.managerName=managerName;
		
		
	}
	
	
	
	
	
	
	
}
