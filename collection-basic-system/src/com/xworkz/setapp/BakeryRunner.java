package com.xworkz.setapp;


import java.util.LinkedHashSet;
import java.util.Set;

public class BakeryRunner {

	public static void main(String[] args) {

		BakeryDto bakerDto1 = new BakeryDto("Mani Bakery", 800, "Yellow", "Sundhar");

		BakeryDto bakerDto2 = new BakeryDto("Mani Bakery", 800, "Blue", "Vinayak");

		
		Set<BakeryDto> list = new LinkedHashSet<BakeryDto>();
	

		list.add(bakerDto1);
		list.add(bakerDto2);

		System.out.println(list);

		for (BakeryDto bakry : list) { 
			System.out.println("Overiden :" + bakry.hashCode());
			System.out.println("Oriuginal :" + System.identityHashCode(bakry));
		}
	}
}
