package com.xworkz.exampleabstraction;

public class Atm implements Bank {

	int balance = 200000;

	@Override
	public void Deposit(int amount) {

		System.out.println("Deposit balance :" + amount);
		balance = balance + amount;
		System.out.println("Amount deposit SuccesFully");

	}

	@Override
	public void Withdraw(int amount) {
		System.out.println("Withrdraw Amount :"+amount);
		balance -= amount;
		System.out.println("Amount Withdrawing successfully");
	}

	@Override
	public void ChechBalance() {
		System.out.println("Ckecking After Blance :"+balance);

	}
}
