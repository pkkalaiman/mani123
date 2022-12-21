package com.xworkz.forloopapp;

import java.util.Scanner;

public class Engine {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice");
		char ch=sc.next().charAt(0); // is method of String
		
		switch(ch) {
		
		case 'i' :
			
			       SendImg img = new SendImg("mani", 123456789l, "<coding world>");
		           img.sendImg("kandan", "c://documents/desktop/my.jpj");
		       break;
		       
		case 't' :
			
			      SendText send = new SendText("vishak", 657677647658l, "<coding world>");
			for(int i=0;i<5;i++) {
		          send.sendTxt("ganesh", "hello dabba fellow.. !! where are you...??");
	        }  
		       break;
		case 'b' : 
		default : System.out.println("ivalid choice");
	}
	}
}
