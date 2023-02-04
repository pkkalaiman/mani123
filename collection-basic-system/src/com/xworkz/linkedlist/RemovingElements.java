package com.xworkz.linkedlist;

import java.util.LinkedList;

public class RemovingElements {
	
	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("Mani");
		list.add("Harish");
		list.add("Jagathiesh");
		list.add("Karnan");
		
		System.out.println("Before Removing :"+list);
		
		list.remove("Karnan");
		
		System.out.println("After Removing :"+list);
	}

}
