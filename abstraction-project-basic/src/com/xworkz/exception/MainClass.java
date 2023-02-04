package com.xworkz.exception;

public class MainClass {

	public static void main(String[] args) {
		
		String n="Mani";
		
	char[] ch=	n.toCharArray();
	
	for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
	}
	System.out.println();
	for(int i=ch.length-1; i>=0;i--) {
		System.out.println(ch[i]);
	}
	
	}
	
}
