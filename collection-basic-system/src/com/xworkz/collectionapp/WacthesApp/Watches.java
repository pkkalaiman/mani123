package com.xworkz.collectionapp.WacthesApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Watches {
	
	public static void main(String[] args) {
		
		String watch1="TITAN";
		String watch2="SONOTA";
		String watch3="PUMA";
		String watch4="ROLEX";
		String watch5="GOLDEN";
		
		
		Collection<String> watch=new ArrayList<String>();
	
		watch.add(watch5);
		watch.add(watch4);
		watch.add(watch2);
		watch.add(watch3);
		watch.add(watch1);
		
		System.out.println("Before Clear \n");
		
		System.out.println(watch);
		
		System.out.println("size :"+watch.size());
		
		System.out.println("After Clear \n");
		
	 Iterator<String> itr=watch.iterator();
	 
	 while(itr.hasNext()) {
	 
	 String Elements=itr.next();
	 
	 System.out.println(Elements);
	 
	}
	 watch.clear();
	}
}
