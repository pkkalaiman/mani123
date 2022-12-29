package com.xworkz.collectionapp.AnimalsApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animals {
	
public static void main(String[] args) {
		
		String an1="LION";
		String an2="TIGER";
		String an3="RABIT";
		String an4="COW";
		String an5="CAT";
		String an6="BISON";
		String an7="SHEEP";
		String an8="PANDA";
		String an9="FOX";
		String an10="HORSE";
		
		Collection<String> col=new ArrayList<String>();
		
		col.add(an1);
		col.add(an2);
		col.add(an10);
		col.add(an9);
		col.add(an7);
		col.add(an8);
		col.add(an5);
		col.add(an6);
		col.add(an4);
		col.add(an3);
		
		System.out.println("Before Clear \n"); // ( you want space u can use this \n)
		
		System.out.println(col);  // that statement will be all OBJHECT Printing
		
		System.out.println(col.remove(an4));
		
		System.out.println(col.contains("panda"));
		
		System.out.println("Size :"+col.size()); // the statement is printing SIZE method
		
		System.out.println("After Clear \n");
		
		
		Iterator<String> itr=col.iterator();
	
		
		while(itr.hasNext()) {
			
			String Elements=itr.next();
			
			System.out.println(Elements);
		}
		
		
			col.clear();
		
		
	}

}
