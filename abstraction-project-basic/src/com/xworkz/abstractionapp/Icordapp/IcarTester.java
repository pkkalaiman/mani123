package com.xworkz.abstractionapp.Icordapp;

public class IcarTester {
	
	public static void main(String[] args) {
		
		Icard card =new HdfcBank();
		
		Icard card1 =new IdfcBank();
		
		card.swipe();
		
		card1.swipe();
		
		//Bank b = new Bank();
		

	}

}
