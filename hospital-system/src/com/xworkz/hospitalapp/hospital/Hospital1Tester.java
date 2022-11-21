package com.xworkz.hospitalapp.hospital;

import java.util.Scanner;

import com.xworkz.hospitalapp.Gender;
import com.xworkz.hospitalapp.petient.Patient;

public class Hospital1Tester {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the patient name");
		String patientName = sc.next();
		System.out.println("enter the adress");
		String adress= sc.next();
		
		Patient patient = new Patient(patientName,adress, Gender.male);
		
		
		
         Hospital1 hospital1 = new Hospital1();
         
		hospital1.isTreatmentRequired= true;
		Object hospita1l;
		
		hospital1.isEmergency=true;
		 hospital1.admit(patient);
		
		
      sc.close();
	}

}
