package com.xworkz.abstractionapp.abstraction;

public class BikeServiceShop implements Shop{

	
	//multiple class can implement is one implement
	
	// when you don't want all object u can create in abstract class
	
	//this abstract key words method
	//public abstract void giveService1();
	
	//this is congcreat method
	//public void giveService() {}
	
	@Override
	public void doBissiness() {
		System.out.println("Shop comming in Bike Service");
		
		
	}

	public void helpPeople() {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public void helpPeople() {
		// TODO Auto-generated method stub
		
	}*/
	
	
	

}
