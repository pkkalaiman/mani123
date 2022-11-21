package com.xworkz.basicaccount.accountapp;

public class BasicBankAccount {
	
	private double balance;
	
	//set balance
	
	public void Account() {
	balance=0.0;
	
	}
		
	//deposit
	public void deposite(double amount) {
		balance=balance + amount;
		
	}
	
	public void withdraw(double amount) {
		balance=balance + amount;
		
	}
	
	public double getBalance() {
		return balance;
		
	}
	
	
	
}

