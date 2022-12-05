package com.xworkz.overloadingapp;

public class PetrolBunkTester {

	
public static void main(String args[]) {
		
		String workersName[] = {"Mani", "Sudha", "Shridher", "Manikandan", "Abishek"};
		
		PetrolBunk Bunk =new PetrolBunk(123 , "Devendra PetrolBunk" , "Bhanssankari 2nd street", workersName);

		System.out.println("Bunk.id"+" "+Bunk.id);
		System.out.println("Bunk.name"+" "+Bunk.name);
		System.out.println("Bunk.location"+" "+Bunk.location);
		System.out.println("Bunk.workersName"+" "+Bunk.workersName);
		
		
}
	
}
