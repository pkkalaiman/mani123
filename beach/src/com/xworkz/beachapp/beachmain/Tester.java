package com.xworkz.beachapp.beachmain;

public class Tester {
	
	public static void main(String[] args) {
		
	System.out.println("main method is created");
	
	String  var2 = "radhika";//litrallys he is store in SCP
	String var1 = "dhanush";
	
	//String object behaviar as IMMUTABLE in nature
	String var =new String("dhanush");// string object by using new key word he is store in HEAP
	
	var=var1;
	
	 var2=var1;
	 
	 System.out.println(var == var1);
	
	    System.out.println(var1 == var2);
	    
	    System.out.println(var.equals(var2));
	    
	    
	    
	    
	    
	    
	    
	    String str =new String("baba");
	    
	System.out.println("---------------");
	
	String str1=str;
	
	System.out.println(str==str1);
	    
	    
	    
	
	 
	}
	
}


