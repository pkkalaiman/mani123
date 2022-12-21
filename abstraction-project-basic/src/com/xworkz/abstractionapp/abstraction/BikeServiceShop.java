package com.xworkz.abstractionapp.abstraction;

public class BikeServiceShop implements Shop{

	
	//multiple class can implement is one implement
	
	// when yo dont want all object u can creat in abstract class
	
	//this abstract ke words method
	//public abstract void giveService1();
	
	//this is congcreat method
	//public void giveService() {}
	
	@Override
	public void doBissiness() {
		System.out.println("Shop comming in Bike Service");
		
		
	}

	/*@Override
	public void helpPeople() {
		// TODO Auto-generated method stub
		
	}*/
	
	
	

}
