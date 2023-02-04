package com.xworkz.exception;

public class Reversing {

	public static void main(String[] args) {

		String m = "Mangalore";

		char[] c = m.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
		
		System.out.println();
		
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}

	}

}
