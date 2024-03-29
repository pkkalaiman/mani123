package com.xworkz.linkedsetapp;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {

		// Creating an empty LinkedHashSet of string type
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

		Set<String> str = new TreeSet<String>();

		// Adding element to LinkedHashSet
		// using add() method
		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("D");
		System.out.println("Before joining to the charctors :" + linkedset);
		System.out.println("Size of LinkedHashSet = " + linkedset.size());
		// Note: This will not add new element
		// as A already exists
		linkedset.add("A");
		linkedset.add("E");
		// Set is not allowed in duplicate
		System.out.println("After Adding in characters ");
		// Getting size of LinkedHashSet
		// using size() method
		System.out.println("Size of LinkedHashSet = " + linkedset.size());

		System.out.println("Original LinkedHashSet:" + linkedset);

		// Removing existing entry from above Set
		// using remove() method
		System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("D"));

		// Removing existing entry from above Set
		// that does not exist in Set
		System.out.println("Trying to Remove Z which is not " + "present: " + linkedset.remove("Z"));

		// Checking for element whether it is present inside
		// Set or not using contains() method
		System.out.println("Checking if A is present =" + linkedset.contains("A"));

		// New lastly printing the updated LinkedHashMap
		System.out.println("Updated LinkedHashSet: " + linkedset);

	}

}
