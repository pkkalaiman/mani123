package com.xworkz.treesetapp;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetRunner {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<Integer>();

		set.add(22);
		set.add(23);
		set.add(43);
		set.add(32);
		set.add(54);

		System.out.println(set);

		for (Integer integer : set) {

		System.out.println(integer.hashCode() + 1);
		// (-1 you mention show the output is your object -0,-1,-2, this type printing)
		 // (+1 you mention show the output is your object +2,+3,+4, this type printing)
		}

		System.out.println(set.contains(42)); // contains method

		System.out.println(set.remove(23)); // remove method

		System.out.println(set.size()); // size method

	}

}
