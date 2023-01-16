package com.xworkz.stringapp.splitapp;

public class SpliteMethod {

	public static void main(String[] args) {

		String str = "MANI IS BEUTIFUL BOY";

		String arr[] = str.split(" ");
		
		for(String i:arr) {
			System.out.println(i);
		}
		System.out.println("world in"+" "+str+" "+"is :"+arr.length);
	
//		for(int i=0;i<=1;i++) {
//			for(int j=0;j>=i;j--){
//	
//				System.out.println("printing the array :"+arr.length);
//			}
//		}
		
		
	}
}
