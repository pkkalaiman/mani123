package com.xworkz.buffer;

public class Reverse {

	public static void main(String []args) {
		
		String a="Mani Come";
		
		char ch[]=a.toCharArray();
		for (char c : ch) {
			System.out.print(c);
		}
		System.out.println();
		StringBuffer buf=new StringBuffer("Mani Come");
		
		System.out.println(buf.reverse());
	}
	
}
