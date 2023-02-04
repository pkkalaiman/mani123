package com.xworkz.NestedIf;

public class NestedIf {

	public static void main(String[] args) {

		String id = "Mani";
		int password = 12345;

		if (id == "Mani") {
			System.out.println(" User Id is Valide");

			if (password == 123) {
				System.out.println("Password is Valid");
				System.out.println("Login Is Successfully..."); // id password is valid this step will execute Others
																// is stop
			} else {
				System.out.println("Password is Invalid");
				System.out.println("Login Unsuccessfully..."); // id and password is invalid then this execute this step
			}
		} else {
			System.out.println("User Id is Invalid");
			System.out.println("Login Unsuccessfully...");
		}

	}

}
