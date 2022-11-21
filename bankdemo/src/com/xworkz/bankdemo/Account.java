package com.xworkz.bankdemo;

public class Account {
	
	private double balance;

	
	//Set Balance to 0.0
	
	public Account() {
		this.balance=0.0;
		
	}
	
	//deposit
	
	public void deposite(double amount) {
		this.balance=balance + amount;
		
		
	}
	
	//withdraw
	public void withdraw(double amount) {
		this.balance= balance - amount;
		
		
	}
	
	//get Balance
	public double getBalance() {
	return balance;
	}

}
