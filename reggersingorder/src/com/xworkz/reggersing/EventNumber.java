package com.xworkz.reggersing;

public class EventNumber {
	
	static int n=10, m=1;
	
	public static void display() {
		
		if(n-->=1) {
			System.out.print(m+" ");
			m+=3;
			display();
		}
		
	}
	
	public static void main(String[] args) {
		display();
	}

}
