package com.xworkz.polyndremapp.polyndrem.polyndremapp;

import java.util.Scanner;

public class StringReversing {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String s =sc.nextLine();
		
		System.out.println("String reversing: "+s);
		
		char ch[]=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
			
		}
		
		System.out.println();
	}

}
