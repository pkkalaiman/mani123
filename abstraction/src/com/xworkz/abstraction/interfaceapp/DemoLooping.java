package com.xworkz.abstraction.interfaceapp;

import java.util.Scanner;

public class DemoLooping {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		   while (true) { // it is condition will true then executed
			System.out.println("Enter Choice :");
			int choice = sc.nextInt(); // it is using in statement corract and go next

			switch (choice) {
			case 1:
				System.out.println("Hi Mani");
				break; // it using in break this statement

			case 2:
				System.out.println("By Mani");
				break;
			
			case 3:
				System.out.println("Thank You");
				System.exit(0); // this using in Statment will finish in all get printed
				
			default:
				System.out.println("Invalild Function");
				break;
				
			}
		}

	}

}
