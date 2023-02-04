package com.xworkz.exampleabstraction;

public class BankRunner {
	
	public static void main(String[] args) {
		
		Atm b= new Atm();
		
		b.ChechBalance();
		System.out.println("===============");
		b.Deposit(200000);
		b.ChechBalance();
		
		System.out.println("===================");
		b.Withdraw(30000);
		b.ChechBalance();
		
	}

}
