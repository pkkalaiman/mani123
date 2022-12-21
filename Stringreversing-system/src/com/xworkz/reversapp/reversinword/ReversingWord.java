package com.xworkz.reversapp.reversinword;

import java.util.Scanner;

public class ReversingWord {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		 System.out.println("enter the Sentence");
		 
		 	String sentence=sc.nextLine();
		 	System.out.println("enter the word");
			 
		 	String word =sc.next();
		 	
		 	String reverce =" ";
		 	
		 		String[] str =sentence.split(" ");
		 		
		 		for(int i=0; i <str.length;i++) {
		 			if(str[i].equals(word)) {
		 				
		 				char ch[]=word.toCharArray();
		 				for(int j=word.length()-1;j>=0;j--) {
		 					reverce=reverce+ch[j];
		 					
		 				}
		 				str[i]=reverce;
		 				
		 			}
		 		}
		 		for(int i=0;i<str.length;i++) {
		 			System.out.print(str[i]+" ");
		 		}
		 		
		 		//System.out.println("");
	}

}
