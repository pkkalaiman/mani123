package com.xworkz.polyndremapp.polyndrem;

import java.util.Scanner;

public class Polyndrem {
	
	
	 public static void main(String args[])  
	   {  
	      String xworkz, reverse = ""; // Objects of String class 
	      
	      Scanner in = new Scanner(System.in);   
	      
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      xworkz = in.nextLine();   
	      
	      int length = xworkz.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + xworkz.charAt(i); 
	      
	      if (xworkz.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	   }  

}
