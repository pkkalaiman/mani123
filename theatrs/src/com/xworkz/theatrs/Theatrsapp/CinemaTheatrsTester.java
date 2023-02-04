package com.xworkz.theatrs.Theatrsapp;

public class CinemaTheatrsTester {

	
	public static void main(String[] a) {
		
		Theatrs thetr=new Theatrs("Mani", 23, "Rajanager", "Bangalore");
		
		
		thetr.getAddress();
		thetr.getName();
		thetr.getId();
		thetr.getLocation();
		
		for (String string : a) {
			System.out.println(a);
		}
		
		
		
		
	}
	
	
	
}
