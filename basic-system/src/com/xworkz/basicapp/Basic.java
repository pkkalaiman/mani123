package com.xworkz.basicapp;

public class Basic {


	public String balance;
	
	public void account() {
		this.balance=0.0;
		
	}
	
	//deposit
	
	public void deposite(double amount) {
		this.balance="balance:"+ amount;
		
	}
	
	//withdraw
	public void withdraw(double amount) {
		this.balance=balance;
		
		
	}
	
	//get Balance
	public String getBalance() {
	return balance;
		
	}
	
	
 

}
