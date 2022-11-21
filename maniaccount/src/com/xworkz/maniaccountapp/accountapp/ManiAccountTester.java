package com.xworkz.maniaccountapp.accountapp;


import com.xworkz.maniaccountapp.ManiAccount;

public class ManiAccountTester{
		
		public void main(String[] args) {
			
			ManiAccount draw=new ManiAccount();
			draw.deposit(5000);
			
			System.out.println("Account balance:"+draw.balance);
			draw.withDraw(250);
			
			System.out.println("Account balance after withDraw:"+draw.balance);
			draw.deposit(10000);
			
			draw.withDraw(2000);
			System.out.println("Account balance after withDraw:"+draw.balance);
			
			draw.percent();
			System.out.println("balance:"+draw.balance);
			
			draw.withDraw(10000);
			System.out.println("balance:"+draw.balance);
			
			ManiAccount friendsAccount=new ManiAccount();
			
			friendsAccount.deposit(700);
			System.out.println("the friendsAccount balance is"+friendsAccount.balance);
			draw.transfer(600,friendsAccount);
			
			
			System.out.println("balance of friends Account after transfer"+friendsAccount.balance);
			
			System.out.println("total balance"+draw.balance);
			
			
			// inheritence: acquiring properties from one class to another class-i.e from perent to child/supper to sub class
			//base to derived class
			// is -a relationship
			//extends
			//class level
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
