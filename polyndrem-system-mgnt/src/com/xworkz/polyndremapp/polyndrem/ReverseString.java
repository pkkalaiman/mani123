package com.xworkz.polyndremapp.polyndrem;

import java.util.Scanner;

public class ReverseString {
	
	String str ="";
 
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	
	System.out.println("String before reverse : "+s);
	
	char c[]=s.toCharArray();
	for(int i=c.length-1;i>=0;i--) {
		System.out.print(c[i]);
		
	}
	System.out.println();
}
}
