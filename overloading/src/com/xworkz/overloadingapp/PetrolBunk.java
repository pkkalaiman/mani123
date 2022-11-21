package com.xworkz.overloadingapp;

public class PetrolBunk {
	
	public int id;
	public String name;
	public String location;
	public String workersName[] = new String[7];
	
	//Default Constructor
	
	public PetrolBunk(){
		
		System.out.println("Petrol Bunk object is created");
	}

	//parameterized Constructor
	
	public PetrolBunk(int id ,String name , String location , String[]workersName)
			
	{
		
		this();
		System.out.println ("calling parameterized contructor");
		this.id = id;
		this.name = name;
		this.location = location;
		this.workersName = workersName;
		
		
	}
	
		
	}
	
	


