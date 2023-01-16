package com.xworkz.linkedlistapp;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskArrayList {

	public static void main(String[] args) {

		String wath1 = "Titan";
		String wath2 = "Rolex";
		String wath3 = "Rolex";
		String wath4 = "Sonata";
		String wath5 = "Puma";
		String wath6 = "Tager";

		ArrayList<String> wath = new ArrayList<String>();

		wath.add(wath6);
		wath.add(wath5);
		wath.add(wath4);
		wath.add(wath3);
		wath.add(wath2);
		wath.add(wath1);

		System.out.println("Before Size of ArrayList :"+wath.size());
		
		System.out.println("Original elements :"+wath);
		
		System.out.println("Removing from R elements :"+wath.remove("Rolex"));
		
		System.out.println("Trying to remove Z hich is not"+ "Present :"+wath.remove("Z"));
		
		System.out.println("Checking if Tiger is present :"+wath.contains(wath1));
		
		System.out.println("After Size in ArrayList :"+wath);
		
		
		
		
		System.out.println();
		
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

		Set<String> str = new TreeSet<String>();

		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("D");

		linkedset.add("A");
		linkedset.add("E");

		System.out.println("Size of LinkedHashSet = " + linkedset.size());

		System.out.println("Original LinkedHashSet:" + linkedset);

		System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("D"));

		System.out.println("Trying to Remove Z which is not " + "present: " + linkedset.remove("Z"));

		System.out.println("Checking if A is present=" + linkedset.contains("A"));

		System.out.println("Updated LinkedHashSet: " + linkedset);

	}

}
