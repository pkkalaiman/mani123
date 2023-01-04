package com.xworkz.abstractionapp.Laptop;

public class LaptopTester {
	
	public static void main(String[] args) {
		
		Laptop l =new LaptopCompany();
		l.doLaptop();
		
		for (String string : args) {
			System.out.println(string);
		}
	}

}
