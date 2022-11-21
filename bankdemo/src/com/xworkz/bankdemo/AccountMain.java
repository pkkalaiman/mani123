package com.xworkz.bankdemo;

public class AccountMain {
	
	public static void main(String[] args) {
		
		Account cust1=new Account();
		cust1.deposite(5000);
		
		Account cust2=new Account();
		cust2.deposite(1299);
		
		Account cust3=new Account();
		cust3.withdraw(400);
		
		System.out.print("cust1 as a balance of");
		System.out.println(cust1.getBalance());
		
		System.out.print("cust2 as a balance of");
		System.out.println(cust2.getBalance());
		
		System.out.print("cust3 as a balance of");
		System.out.print(cust3.getBalance());
		
		
	}

}
