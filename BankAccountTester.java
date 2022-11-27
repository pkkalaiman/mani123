package com.xworkz.bankapp.bankaccount;
import com.xworkz.bankapp.BankAccount;
import com.xworkz.bankapp.bankaccount.currentaccount.CurrentAccount;
import com.xworkz.bankapp.bankaccount.savingsaccount.SavingsAccount;
public class BankAccountTester {
public static void main(String[] args) {
	
	BankAccount myAccount = new BankAccount();
	myAccount.deposite(5000);
	System.out.println("My account balance is"+myAccount.getBalance());
	
	BankAccount friendsAccount = new BankAccount();
	friendsAccount.deposite(700);
		
	myAccount.transfer(500.0, friendsAccount);
	System.out.println("My account balance is "+myAccount.getBalance());
	
	System.out.println("Friends account balance is "+friendsAccount.getBalance());
	
	SavingsAccount maaSavingsaccount = new SavingsAccount();
	maaSavingsaccount.deposite(500);

	SavingsAccount savingsaccount = new SavingsAccount();
	savingsaccount.deposite(500);
	savingsaccount.transfer(6700, maaSavingsaccount);
	System.out.println("The amount in savings account is : "+savingsaccount.getBalance());
	System.out.println("The amount in my mother's savings account is : "+maaSavingsaccount.getBalance());
	
	CurrentAccount currentaccount = new CurrentAccount();
	currentaccount.deposite(1000);
	currentaccount.transfer(89086, savingsaccount);
	System.out.println("The amount in current account is : "+currentaccount.getBalance());
	System.out.println("The amount in savings account is : "+savingsaccount.getBalance());

	
	CurrentAccount vishalaCurrentAccount = new CurrentAccount();
	vishalaCurrentAccount.deposite(4656576989.78);
	vishalaCurrentAccount.transfer(890896789, myAccount);
	System.out.println("My account balance is"+myAccount.getBalance());
	
	
	SavingsAccount savingsAccount2 = new SavingsAccount(0.5);
	savingsAccount2.deposite(2000);
	savingsAccount2.periodicInterest();
	System.out.println(savingsAccount2.getBalance());
}
}

//inheritance : Acquiring properties from one class to another class i.e from parent to child class/Super too Sub class/ Base to derived class.
//it is also called as IS A RELAtionship.
//class level using extends.