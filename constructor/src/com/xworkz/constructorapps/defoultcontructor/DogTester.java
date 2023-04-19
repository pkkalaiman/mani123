package com.xworkz.constructorapps.defoultcontructor;

public class DogTester {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.name = "Mani";
		d.age = 22;
		d.color = "Blue";
		
		System.out.println(d);

	}

	public  void Dog(String name, int age, String color) {

		
	}

}