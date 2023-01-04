package com.xworkz.treesetapp;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {

		/*
		 * you are using gendricse what type of data type you will using that's type of
		 * element only printing. you dono't use the other values
		 */
		TreeSet<Integer> tr = new TreeSet<Integer>();
		// <Integer> is the using in gendrics method

		tr.add(20);
		tr.add(60);
		tr.add(30);
		tr.add(50);
		tr.add(40);
		tr.add(70);
		tr.add(10);
		tr.add(80);

		// this is y error because is the String type that.s y this is get the error
		/* tr.add("30"); */

		// foreach() loop is the printing assenting order
		for (Integer integer : tr) {
			System.out.println(integer);
		}

	}
}
