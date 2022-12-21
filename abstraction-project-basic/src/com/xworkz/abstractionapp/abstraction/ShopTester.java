package com.xworkz.abstractionapp.abstraction;

public class ShopTester {
	
	// interface we can not creat in object
	
	public static void main(String[] args) {
		
		
		//interface object and implements type
		// this is called abstraction
		
		Shop s =new BikeServiceShop();
		s.doBissiness();
	}

}
