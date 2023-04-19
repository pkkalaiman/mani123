package com.xworkz.reggersing;

public class Natural {
	
	static int n=7;
	
	public static int printMe(int x) {
		
		if(x==n)
			return x;
		return x+printMe(x+1);
		
	}
	
	public static void main(String[] args) {
		System.out.println(printMe(1));
	}

}
