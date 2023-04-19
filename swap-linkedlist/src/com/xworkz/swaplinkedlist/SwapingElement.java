package com.xworkz.swaplinkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class SwapingElement {
	
	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("Red");
		list.add("Green");
		list.add("Yellow");
		list.add("Orange");
		list.add("Blue");
		list.add("Block");
		
		
		System.out.println("the original lilst :"+list);
		System.out.println("Before Swaping Elements :"+list.size());
		System.out.println("==================== ");
		Collections.swap(list, 0, 2);
		System.out.println("Swapping elements :"+list);
		System.out.println("Aftrer Swapping Elements :"+list.size());
		
		System.out.println("=========================");
		Collections.swap(list, 1, 5);
		System.out.println("Swapping Elements :"+list);
		System.out.println("Before Swapping Another Elements :"+list.size());
		
	}

}
