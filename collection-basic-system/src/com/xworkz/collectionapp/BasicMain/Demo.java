package com.xworkz.collectionapp.BasicMain;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		ArrayList l = new ArrayList(); // ArrayList is Predefined Class in java.Util Package So you have to Import the
										// ArrayList Class

		System.out.println("=============Add Method =====================");

		l.add(10); // Add() method is used to add an object into the Collection
		l.add(20.34);
		l.add(20);
		l.add(null);
		l.add("java");

		System.out.println(l); // this is print to the all methods in Collections
		System.out.println();

		System.out.println("================= Size Method =========================");

		System.out.println(l.size()); // Size() Methods is used to return the length of the Collection

		System.out.println("============= Containse Methods   =================");

		System.out.println(l.contains("java")); // contains() methods is used to check if the Object is Present (OR) Not
		System.out.println(l.contains("Java")); // true (or) false

		System.out.println(l.get(2)); // get() methods is used to return an object based on the index position

		System.out.println();

		System.out.println("============ Remove Method ===============");

		System.out.println(l);

		l.remove(2); // the remove() methods is used remove an Object Based on the index position

		System.out.println(l);
		System.out.println();

		System.out.println("============== Is Empty Method ===============");

		System.out.println(l.isEmpty()); // isEmpty() methods is used to Check if the Collection is Empty (or) Not*/

		l.clear(); // clear() methods is will remove all the Object From the Collection

		System.out.println(l.isEmpty());

		System.out.println();

		ArrayList x = new ArrayList();

		x.add(20);
		x.add(10);
		x.add(30);
		x.add(10);
		x.add(40);
		x.add(50);
		x.add(10);
		x.add(70);
		x.add(30);

		System.out.println(x);
		System.out.println();

		System.out.println("============== Index Methods ===============");

		// indexOf() methods is used to the index position of an Object and first
		// occurrence in case of duplication
		System.out.println(x.indexOf(10));
		System.out.println(x.indexOf(30)); // that correct output so is Object in present

		System.out.println(x.indexOf(100)); // output -1 so is the Object is not present

		System.out.println("=============== IndexAll Mehtods ==================");

		System.out.println(x.lastIndexOf(10)); // lastIndexOf() method is print the last Object in occurrence of case of
												// duplication
	}

}
