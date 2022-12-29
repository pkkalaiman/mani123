package com.xworkz.collectionsapp.CollectionsApp;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionsDemo {
	
	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
	
		l.add(10); 
		l.add(20);
		l.add(30);
		
		System.out.println(l);
		
		l.add(2, 50); // add() is used to ad an Object based on the index position
		 			  //  that is Already Existing Object Gets Shifted to the next position
		
		System.out.println(l);
		System.out.println();
		
		System.out.println("After list :"+l+"  " +"Size :" + l.size());

		System.out.println("==================");
		
	LinkedList ll=new LinkedList();
	
	ll.add(70);
	ll.add(40);
	
	System.out.println(ll);

	ll.add(0, 60);
	
	System.out.println(ll);
	
	ll.set(2, 80); // set() is used to ad an Object based on the index position
	               //  that is Already Existing Object Gets Overridden (Remove the number)
	System.out.println(ll);
	System.out.println();
	
	System.out.println("After linked list :" +ll + "Size :" +ll.size());
		
	}

}
