package com.xworkz.collectionapp.Collection;

import java.util.Collection;
import java.util.TreeSet;

public class CollectionBasic {

	public static void main(String[] args) {
		
		String mall1 = "lulu mall";
		String mall2 = "Orian mall";
		String mall3 = "mani mall";
		
		Collection<String> col=new TreeSet<String>();
		
		col.add(mall1);
		col.add(mall3);
		col.add(mall2);
		
		System.out.println("Before \n");
		System.out.println(col);
		
		System.out.println("size :"+col.size());
		
		col.clear();
	}
}
