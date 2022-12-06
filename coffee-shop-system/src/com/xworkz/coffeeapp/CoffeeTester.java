package com.xworkz.coffeeapp;

public class CoffeeTester {

	public static  void main(String[] args) {
		
		String coustomerName[] ={"Mani", "Sarath", "Pavankumar", "Kamal"};
		
		BruCoffee bru=new BruCoffee("InstanceCoffee", "Mani", 1200.);
		
		Coffee co=new Coffee();
		co.amount=1245;
		co.coffee=bru;
		System.out.println("costomer name:"+co.amount);
		System.out.println("Brue Cofee:"+co.coffee);
		
		
		
		
	}
}
