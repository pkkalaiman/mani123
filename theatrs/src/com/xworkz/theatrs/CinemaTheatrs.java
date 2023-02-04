package com.xworkz.theatrs;

public class CinemaTheatrs {

	public int id;
	public String name;
	public String location;
	public String managerName;
	
	
	public CinemaTheatrs() {
		
		System.out.println("Cinema Theatrs object is created");
	
	}
	
	public CinemaTheatrs(int id , String name , String location , String managerName)
	{
		
		this();
		
		this.id=id;
		this.name=name;
		this.location=location;
		this.managerName=managerName;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	
	
	
	
	
	
	
	
}
