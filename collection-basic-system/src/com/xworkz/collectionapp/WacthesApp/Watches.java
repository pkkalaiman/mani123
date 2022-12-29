package com.xworkz.collectionapp.WacthesApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Watches {
	
	public static void main(String[] args) {
		
		String watch1="TITAN";
		String watch2="SONOTA";
		String watch3="PUMA";
		String watch6="GOLDEN";
		String watch4="ROLEX";
		String watch5="GOLDEN";
		String watch7="GOLDEN";
		
		
		Collection<String> watch=new ArrayList<String>();
	
		watch.add(watch5);
		watch.add(watch4);
		watch.add(watch2);
		watch.add(watch3);
		watch.add(watch1);
		watch.add(watch6);
		watch.add(watch7);
		
		System.out.println("Before Clear \n");
		
		System.out.println(watch);
		
		System.out.println("size :"+watch.size());
		
		System.out.println("After Clear \n");
		
	 Iterator<String> itr=watch.iterator();
	 
	 while(itr.hasNext()) {
	 String Elements=itr.next();
	 } 
	 
	boolean removed= watch.remove("TITAN");
	 System.out.println("TITAN is removed :"+removed);
	 
	 for(String string: watch) {
		 System.out.println("Elements :"+string);
	 }
	 System.out.println("After removing Size :"+watch.size());
	 

	 for(String itr1: watch) {
		boolean start= itr1.startsWith("G");
		 System.out.println("Starting with in :"+start);
	 }
	 
	 boolean remove=watch.remove("GOLDEN");
	 
	 for(String string:watch) {
		 System.out.println("Starting witch G :"+remove);
	 }
	 System.out.println("After Removing size :"+watch.size());
	 
	 System.out.println("Elements :"+watch);
	 
	
	 watch.clear();
	}
}
