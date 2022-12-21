package com.xworkz.reversapp;

public class ReversingMain {
	
	public static String revstr(String str) {
		String revstr="";
		for(int i=str.length()-1;i>=0;i--) { 
			revstr+=str.charAt(i);
		}
		return revstr;
	}
	
	public static String revwrdstr(String str) {
		
		String words[] = str.split(" ");
		//String restr="";
		for(int i=0;i<words.length;i++) {
			System.out.println(revstr(words[i]));
		}	 
			//restr+=revstr(words[i]);
		
		return str; 
	}

	public static void main(String[] args) {
		
		System.out.println("mani is java trainer");
	}
}
