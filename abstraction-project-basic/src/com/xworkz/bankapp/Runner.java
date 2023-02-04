package com.xworkz.bankapp;

public class Runner {
	
	public static void main(String[] args) {
		
		Atm bank=new Atm();
		
		bank.CheckingBalance();
		System.out.println("=====================");
		
		bank.deposit(2000000);
		bank.CheckingBalance();
		System.out.println("===============");
		bank.Withdraw(3000000);
		bank.CheckingBalance();
		
	}

}
