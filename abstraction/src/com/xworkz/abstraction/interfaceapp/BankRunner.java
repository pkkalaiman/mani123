package com.xworkz.abstraction.interfaceapp;

public class BankRunner {

	public static void main(String[] args) {
		
		Bank obj=new Atm(); // it is UB CASTING method
		
		obj.CheckBalance();
		
		System.out.println("====================");
		obj.Deposit(20000);
		obj.CheckBalance();
		
		System.out.println("===========");
		
		obj.Withdrawing(5000);
		obj.CheckBalance();
		
		
	}
	
}
