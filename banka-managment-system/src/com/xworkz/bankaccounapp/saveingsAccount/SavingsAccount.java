package com.xworkz.bankaccounapp.saveingsAccount;

import com.xworkz.bankaccounapp.bankapp.BankAccount;

  //extends means in Resuability**

public class SavingsAccount extends BankAccount
{
	public String name;
	public double interestRate;
	
	public SavingsAccount() {
		System.out.println("SavingsAccount object is created");
		
	}
	
	//SavingsAccount specific method
	public void SavingAccount (double interestName, double interestRate) {
		this.interestRate=interestRate;
		
	}
	public void periodicInterest() {
		double newBalance = getBalance() * interestRate/100;
	    deposit(newBalance);
	
	
}

	
	}
