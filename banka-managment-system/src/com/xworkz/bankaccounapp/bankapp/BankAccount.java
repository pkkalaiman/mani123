package com.xworkz.bankaccounapp.bankapp;

public class BankAccount {

	// this is variables**

	public String name;
	public String ifscCode;
	public String brancName;
	public String accountNo;
	protected double balance;
	public double interst;
	public int year = 1;
	public String getbalance;

	// this is methods**

	public double withDraw(double balance) {

		System.out.println("this amount is withDrawn");
		this.balance = this.balance - balance;
		return this.balance;
	}

	public double deposit(double balance) {

		System.out.println("this amount to be deposited");
		this.balance = this.balance + balance;
		return this.balance;

	}

	public void transfer(double amount, BankAccount friendsAccount) {
		System.out.println("Transfering to friends account");
		withDraw(amount);
		friendsAccount.deposit(amount);
		System.out.println("tranfering don... Transaction successfull");

	}

	public double getBalance() {
		return balance;

	}

}
