package com.xworkz.exceptionhndaling;

public class Chech {

	public static void main(String[] args) {

		System.out.println("Start");
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
		// Both are Same Output but different step
			System.out.println(e.getMessage());
			/* this print in only exception message only */
			String mesage = e.getMessage(); // this is another step on this exception
			System.out.println(mesage);
		}
		System.out.println("End");
	}

}
