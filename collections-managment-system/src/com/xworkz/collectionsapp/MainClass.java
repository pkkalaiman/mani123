package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		ArrayList l=new ArrayList();
		
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(60);
		l.add(20);
		l.add(50);
		
		System.out.println("Before Sorting :");
		for(int i=0; i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		Collections.sort(l); // Collections.sort() is used to Assanding EX: (10,30,20 >10,20,30) order printing to the variables	
		
		System.out.println("After Sorting :");
		for(int i=0; i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
	}

}
