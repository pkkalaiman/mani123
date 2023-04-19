package com.xworkz.reversapp;

import java.util.Scanner;

public class ReverSing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // using object in Scanner Object
		System.out.println("Enter the Number :"); // Saying in enter number
		
		int num = sc.nextInt(); // number is done u can go next tell java
		
		int org_num=num; // Create a object of original number to other number
		
		int rev=0; // once Reverse the number
		
		while(num !=0) { // number not equalt 0 go next
			rev=rev*10 + num%10;
			num=num /10;
		}
		if(org_num==rev) {
			System.out.println(org_num +" Is A Polyndrem");
		}else {
			System.out.println(org_num +" He Is Not Polynderem");
		}

	}

}
