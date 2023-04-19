package com.xworkz.bankaccounapp.bankapp;

import com.xworkz.bankaccounapp.saveingsAccount.SavingsAccount;

public class BankTester {

	public static class BankAccountTester{
		
		public static void main(String[] args) {
			 //object             //constructor
			BankAccount draw=new BankAccount();
			draw.deposit(5000);
			System.out.println("Account balance:"+draw.getbalance);
			draw.withDraw(250);
			
			
			BankAccount friendsAccouont=new BankAccoount() {
			draw.deposit(10000);
			System.out.println();
			
			draw.withDraw(2000);
			System.out.println("Account balance after withDraw:"+draw.getbalance);
			
			draw.withDraw();
			System.out.println("balance:"+draw.getbalance);
			
			draw.withDraw(10000);
			System.out.println("balance:"+draw.getbalance);
			
			BankAccount friendsAccount=new BankAccount();
			
			friendsAccount.deposit(700);
			System.out.println("the friendsAccount balance is"+friendsAccount.getbalance);
			draw.transfer(600,friendsAccount);
			
			
			System.out.println("balance of friends Account after transfer"+friendsAccount.getbalance);
			
			System.out.println("total balance"+draw.getbalance);
			
			
			// Inheritance: acquiring properties from one class to another class-i.e from parent to child/supper to sub class
			//base to derived class
			// is -a relationship
			//extends
			//class level
			
			SavingsAccount save = new SavingsAccount();
			save.deposit(5000);
			save.withDraw(200);
			System.out.println("total balance"+save.getbalance);
			
			
			
			CurrentAccount currentaccount = new CurrentAccount();
			currentaccount.deposite(1000);
			currentaccount.transfer(89086, savingsaccount);
			System.out.println("The amount in current account is : "+currentaccount.getBalance());
			System.out.println("The amount in savings account is : "+savingsaccount.getBalance());
			
			

			CurrentAccount maniCurrentAccount = new CurrentAccount();
			vishalaCurrentAccount.deposite(4656576989.78);
			vishalaCurrentAccount.transfer(890896789, myAccount);
			System.out.println("My account balance is"+myAccount.getBalance());
			
			
			SavingsAccount savingsAccount2 = new SavingsAccount(0.5);
			savingsAccount2.deposite(2000);
			savingsAccount2.periodicInterest();
			System.out.println(savingsAccount2.getBalance())
			
			
					
			
		}
	}
	
	
	}
	

}
