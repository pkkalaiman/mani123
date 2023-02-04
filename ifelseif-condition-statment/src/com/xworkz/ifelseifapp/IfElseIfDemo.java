package com.xworkz.ifelseifapp;

public class IfElseIfDemo {

	public static void main(String[] args) {

		int marks = -19;

		if (marks >= 81 && marks <= 100) {
			System.out.println("Thats marks is First Class"); // it is true the execute this (or) it is false next will
																// execute the printing
		} else if (marks >= 35 && marks <= 80) {
			System.out.println("Marks is Second class");// it is true the execute this (or) it is false next will
															// execute the printing

		} else if (marks >= 0 && marks <= 100) {
			System.out.println("Marks is Fail!!!(");// it is true the execute this (or) it is false next will
														// execute the printing

		} else {
			System.out.println("Invalid Marks");
		}

	}

}
