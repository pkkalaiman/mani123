package com.xworkz.encapsulationapp.Encapsulationapp;

public class Array {

	int length;
	int breadth;

	// constructor to initialize values
	void Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	// method to calculate area
	public void getArea() {
		int area = length * breadth;
		System.out.println("Area: " + area);
		System.out.println("Array creat in java");
	}
	}

	
