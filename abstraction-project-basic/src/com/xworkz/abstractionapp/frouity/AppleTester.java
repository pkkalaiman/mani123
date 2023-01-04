package com.xworkz.abstractionapp.frouity;

public class AppleTester {

	
	public static void main(String[] args) {
		
		Apple app =new Apple();
		app.frouitStall();
		app.newBrance();
		app.FrouitShop();
		
		System.out.println(app.equals(app));
		System.out.println(app.frouitStall());
		System.out.println(app.equals(app));
		
	}
}
