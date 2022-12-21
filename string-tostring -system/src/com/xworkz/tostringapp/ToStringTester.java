package com.xworkz.tostringapp;

public class ToStringTester {
	
	public static void main(String[] args) {
		
		String str="raja nanna raja";
		
		//this step JVM calling
		System.out.println(str);
		
		//this is developper calling
		//System.out.println(str.toString());
		
		//reference will be go and sit it in HEAP
		Employee enp=new Employee();
		
		enp.setId(1);
		enp.setName("mani");
		System.out.println(enp);
	
		
		
		
	  Employee enp1=new Employee();
	  enp1.setId(2);
	  
	  enp1.setName("om company");
	  System.out.println(enp);
	  
	  // compire two different object in EQUALS
	  System.out.println(enp.equals(enp1));
	  
	  // true false method
	  System.out.println(enp ==enp);
	  
	 
	  System.out.println(enp.hashCode());
	  System.out.println(enp1.hashCode());
	  
	  
	  
	}

}