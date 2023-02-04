package com.xworkz.hospitalapp.Appollohospital;

import java.util.Scanner;  

import com.xworkz.hospitalapp.petient.Patient;

public class AppolloTester {
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scanner.nextInt();
		
			AppolloHospital appollohoapital = new AppolloHospital(size);
			
			Patient patient =new Patient();
			
			patient.patientName = "mani";
			patient.age =22;
			patient.adress ="Nelmangala";
			patient.gender = patient.gender;
			patient.displayInfo();
			
			
			
			
		
	}

}
