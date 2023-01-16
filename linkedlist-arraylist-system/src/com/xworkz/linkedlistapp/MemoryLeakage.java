package com.xworkz.linkedlistapp;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakage {
	 public static void main(String[] args) {
		 
	  List<String> list = new ArrayList<>();
  
	    for (int i = 0; i < 10; i++) {
	      list.add("Item " + i);
	      System.out.println("Done Adding Items to List :"+i);
	    }
	    list.clear();
	    
	 }
}
