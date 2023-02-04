package com.xworkz.abstraction.interfaceapp;

import java.util.Scanner;

public class BankSolution {

	public static void main(String[] args) {

		System.out.println("Welcomt to ATM !!!");
		System.out.println("------------------");

		Scanner sc = new Scanner(System.in);

		Bank b = new Atm();

		while (true) {

			System.out.println("1:Deposit \n2:Withdrawing  \n3:CheckBalance \n4:Exit");
			System.out.println("Enter Choice :");
			int choic = sc.nextInt();

			switch (choic) {
			case 1:
				System.out.println("Enter the amount Deposit");
				int damont = sc.nextInt();
				b.Deposit(damont);
				break;
			case 2:
				System.out.println("Enter the amount :");
				int wamount = sc.nextInt();
				b.Withdrawing(wamount);

			case 3:
				b.CheckBalance();
				break;
			case 4:
				System.out.println("Thank You !!");
				System.exit(0);
			default:
				System.out.println("Invalid Choice .......");
			}
			System.out.println("-----------------------------");

		}

	}

}
