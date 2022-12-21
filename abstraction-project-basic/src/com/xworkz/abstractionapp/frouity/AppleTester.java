package com.xworkz.abstractionapp.frouity;

public class AppleTester {

	
	public static void main(String[] args) {
		
		Apple app =new Apple();
		app.frouitStall();
		app.newBrance();
		
		System.out.println(app.equals(args));
		System.out.println(app.frouitStall());
		
	}
}
