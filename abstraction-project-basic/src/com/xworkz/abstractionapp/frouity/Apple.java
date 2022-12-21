package com.xworkz.abstractionapp.frouity;

public class Apple implements Frouit {

	@Override
	public boolean frouitStall() {
		System.out.println("Mani frouit Stall");
		return false;
	}

	@Override
	public int newBrance() {
		System.out.println("price is :100" );
		return 0;
	}

}
