package com.xworkz.bankapp;

public class Atm implements HdfcBank {
	
	
	int balance = 300000;

	@Override
	public void deposit(int amount) {
		System.out.println("Deposit Balance :"+amount);
	   balance=balance + amount;
	   System.out.println("Deposit Successfully ");
		
	}
	@Override
	public void Withdraw(int amount) {
		System.out.println("Withsraw balance :"+amount);
		balance = balance +amount;
		System.out.println("Withdrawing Successfully");
		
	}

	@Override
	public void CheckingBalance() {
		System.out.println("After Checking Balance :"+balance);
		
	}

	
	
	
}
