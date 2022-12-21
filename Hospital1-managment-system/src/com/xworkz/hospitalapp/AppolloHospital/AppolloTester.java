package com.xworkz.hospitalapp.AppolloHospital;

import java.util.Scanner;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.hospital.Gender.Gender;
import com.xworkz.hospitalapp.hospital.patient.Patient;

public class AppolloTester {
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size");
		int size =sc.nextInt();
		
		AppolloHospital appoloHospital = new AppolloHospital(size);
		
		for(int i=0;i<size;i++) {
			
		Patient patient =new Patient(null, size, null, null);
		
		System.out.println("enter patient name");
		patient.setName(sc.next());
		
		System.out.println("enter patient age ");
		patient.setAge(sc.nextInt());
		
		System.out.println("enter patient gender ");	
		String gender=sc.next();
		patient.setGender(Gender.valueOf(gender));
		
		
		System.out.println("enter patient Address ");
		patient.setAddress(sc.next());
		
		
		appoloHospital.addPatient(patient);
		
		}
		
		
		  appoloHospital.getAllPatients();

		
		System.out.println("Get Patient Detailes by name");
		appoloHospital.getPatientByName(sc.next());
		
	
		System.out.println("Get Patient Detailes by age");
		appoloHospital.getPatientbyAge(sc.nextInt());
		
		
		System.out.println("Get Patient Detailes by gender");
		appoloHospital.getGenderBygenderName(sc.next());
		
		System.out.println("Get Patient Detailes by Address");
		appoloHospital.getPatientbyAddress(sc.next());
		
		
		System.out.println("Get Patient Gender by using Name");
		appoloHospital.getGenderBygenderName(sc.next());;

		System.out.println("Get Patient Name by using Gender");
		appoloHospital.getGenderBygenderName(sc.next());
		

	
		for(int i=0;i<size;i++) {
			
		Patient patient =new Patient(null, size, null, null);
		
		System.out.println("Enter the updateAddressByName");
		appoloHospital.getAllPatients();
		
		//AppolloHospital UpdateAgeByName (name,newAge);
		
		}
		
		
		
		System.out.println("Enter the patient Name to Delete");
		String patientName = sc.next();
		
		appoloHospital.deletePatientByName(patientName);
		
		appoloHospital.getAllnewPatients();
		
		
		
	sc.close();	
	}


}
