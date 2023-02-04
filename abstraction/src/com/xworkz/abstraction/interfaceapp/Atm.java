package com.xworkz.abstraction.interfaceapp;

public class Atm implements Bank {  // is -A Relationship is 2nd Step

	int balance = 10000;

	/*
	 * this interface IMPLEMENTS in Supper class you write compulsary in UNIMPLEMENT
	 * method
	 */
	// you not write in public it will show the ERROR
	@Override
	public void Deposit(int amount) {  // Override is a 3rd Step
		System.out.println("Deposit Balance RS :" + amount);
		balance = balance + amount;
		System.out.println("Deposite Succesfully.......");
	}

	@Override
	public void Withdrawing(int amount) {
		System.out.println("Withdrawing Amount :" + amount);
		balance -= amount;
		System.out.println("Withdarwing Succesfulyy........");
	}

	@Override
	public void CheckBalance() {
		System.out.println("Available Balance :" + balance);

	}
}
