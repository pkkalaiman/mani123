package com.xworkz.hospitalapp.Appollohospital;

import java.util.Scanner;

import com.xworkz.hospitalapp.Gender;
import com.xworkz.hospitalapp.petient.Patient;

public class AppolloTester1 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enetr the size");
		int size =scanner.nextInt();
		
		AppolloHospital appollohospital =new AppolloHospital(size);
		for(int i=0;i<size;i++) {
			Patient patient =new Patient();
			System.out.println("Enter the patient name:");
			patient.patientName=scanner.next();
			
			System.out.println("Enter the patient age:");
			patient.age=scanner.nextInt();
			
			System.out.println("Enter the patient Gender:");
			patient.gender=Gender.valueOf(scanner.next());
			
			System.out.println("Enter the patient Address:");
			patient.address=scanner.next();
			
			appollohospital.addPatients(patient);
			
		}
		appollohospital.getAllPAtients();
		System.out.println("Enter the patient Name");
		String patientName =scanner.next();
		//appollohospital.getPatientByName(patientName);
	}
}
