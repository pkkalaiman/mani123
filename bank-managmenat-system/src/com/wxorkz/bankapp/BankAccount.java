package com.wxorkz.bankapp;

public class BankAccount {
	
	
	// name , ifscCode , branceName , accountNo
	
	String name;
	String ifscCode;
	String branceName;
	String accountNo;
	double amount;
	private String balance;
	
	public String withDraw(String amount)
	{

		balance = this.balance+ balance ;
		return balance;

	}

	public String deposite(String amount)
	{
		
		balance = this.balance + balance  ;
		return balance  ; 
		
		
	}
	
}
