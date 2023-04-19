package com.xworkz.oddevennumberapp.NumberSeries;

public class Satatic {
	
	 static void myShow() {
		System.out.println("Sataic Method");
	}
	 
	 public void myPublicmain() {
		 System.out.println("Creating method");
	 }
	 
	 public static void main(String[] args) {
		
		 myShow();
		 
		 Satatic st=new Satatic();
		 st.myPublicmain();
	}

}
