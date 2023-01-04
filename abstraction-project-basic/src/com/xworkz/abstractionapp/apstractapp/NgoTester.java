package com.xworkz.abstractionapp.apstractapp;

public class NgoTester {
	
	public static void main(String[] args) {
		
		Shop s =new NgoContractPersion();
		s.doBisuness();
		
		for (String str : args) {
			System.out.println(str);
		}
	}

}
