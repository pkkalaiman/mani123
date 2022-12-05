package com.xworkz.atmapp.ProjectATM.MainClass;

import java.util.Scanner;

import com.xworkz.atmapp.ProjectATM.MainClass.Interface.AtmOparationImple;
import com.xworkz.atmapp.ProjectATM.MainClass.Interface.AtmOparationInterf;

public class MainClass {
	
	public static void main(String[] args) {
		
		AtmOparationInterf op=new AtmOparationImple();
		int atmnumber=123456;
		int atmpin =1234;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Wlcome To HDFC Bank !!!");
		
		System.out.println("Enter Atm Number :");
		
		int atmNumber=in.nextInt();
		
		System.out.println("Enter pin :");
		
		int pin=in.nextInt();
		if((atmnumber==atmNumber)&&(atmpin==pin)){
			while(true) {
				System.out.println("1.view Avilable Balance\n2.Withdraw Amount\n3.Dposit Amount\n4.Mini Statement\n5 Exit");
				
				System.out.println("Enter Choice :");
				int ch=in.nextInt();
				if(ch==1) {
					op.viewBalncne();
					
				}
				else if(ch==2){
					System.out.println("Enter Amount to withdraw");
					double withdrawAmount=in.nextDouble();
					op.withdrawAmount(withdrawAmount);
					
				}
				else if(ch==3) {
					
					System.out.println("Enter Amount to Deposit : ");
					double depositeAmount=in.nextDouble();//5000
					op.depositeAmoount(depositeAmount);
					
				}
				else if(ch==4) {
					op.miniStatement();
					
				}
				else if(ch==5) {
					System.out.println("Collect Your ATM Card\n Thank You for using ATM Mechine");
					System.exit(0);
				}
				else {
					System.out.println("Please enter correct choice");
				}
			}
		}
		
		else {
			System.out.println("Incorrect Atm Number or Pin");
			System.exit(0);
		}
	}

}
