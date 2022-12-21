package com.xworkz.abstractionapp.Trasportationapp;

public class VrlImple implements RedBusContract {
	
	 

	@Override
	public boolean conditionbOfBus() {
		
		return true;
	}

	@Override
	public int minBookinggs() {
		return 23;
	}

}
