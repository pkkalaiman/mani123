package com.xworkz.collectionapp.SweetsApp;

import java.util.Collection;
import java.util.TreeSet;

public class Sweets {
	
public static void main(String[] args) {
		
		
		String swet1="Maizoor Pak";
		String swet2= "Jilabi";
		String swet3 = "Bhader Shaw";
		String swet4 = "Pall Ghova";
		String swet5 = "Barfi";
		String swet6 = "Gulab Jamun";
		String swet7 = "Darvad Peda";
		String swet8 = "Rasgulla";
		String swet9 = "Pan Cake";
		String swet10="Laddu";
		
		Collection<String> swet=new TreeSet<String>();
		
		swet.add(swet9);
		swet.add(swet1);
		swet.add(swet2);
		swet.add(swet3);
		swet.add(swet4);
		swet.add(swet5);
		swet.add(swet6);
		swet.add(swet7);
		swet.add(swet8);
		swet.add(swet10);
		
		System.out.println("Before clear");
		
		System.out.println(swet);
		
		System.out.println("Size :"+swet.size());
		
		System.out.println("After clear \n");
		
		
		swet.clear();
		
		
	}


}
