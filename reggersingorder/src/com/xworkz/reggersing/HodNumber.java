package com.xworkz.reggersing;

public class HodNumber {
	
	static int n=20, m=2;  // how many no u want to print n=20;
							// which type Hod No (or) event No you want print the  (is Hod No(m=2)) (is Event No(m=1))
	
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
