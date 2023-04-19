package com.xworkz.reggersing;

public class NaturalNumber {
	
	static int n=20;
	
	public static int printMe(int x) {
		if(x==n) 
			return x;
			return x+printMe(x+1);
	
	}

	public static void main(String a[]) {
		System.out.println(printMe(1));
	}
}
