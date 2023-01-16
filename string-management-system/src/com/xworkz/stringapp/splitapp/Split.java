package com.xworkz.stringapp.splitapp;

public class Split {
	
	public static void main(String []a) {
		
		String num="Bangalore is a Beutiful City";
		String arr[]=num.split(" ");
		
		for(String r:arr) {
			System.out.println(r);
			
		}
		System.out.println("world in"+" "+num+" "+"is :"+arr.length);
	}
	

}
