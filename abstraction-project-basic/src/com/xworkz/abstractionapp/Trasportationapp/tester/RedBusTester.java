package com.xworkz.abstractionapp.Trasportationapp.tester;

import com.xworkz.abstractionapp.Trasportationapp.RedBusContract; 
import com.xworkz.abstractionapp.Trasportationapp.TransPortation;
import com.xworkz.abstractionapp.Trasportationapp.VrlImple;

public class RedBusTester {
	
	public static void main(String[] args) {
		
        RedBusContract buscontract =new VrlImple();
		
		TransPortation trans =new TransPortation();
	
		buscontract.conditionbOfBus();
		buscontract.minBookinggs();
		
		trans.bookings(buscontract);
		
		/*System.out.println(buscontract.conditionbOfBus());
		System.out.println(buscontract.minBookinggs());
		System.out.println(trans.bookings(buscontract));*/
	}

}
