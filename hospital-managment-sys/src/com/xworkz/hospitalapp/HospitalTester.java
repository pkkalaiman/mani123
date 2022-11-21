package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.hospital.Hosptial;
import com.xworkz.hospitalapp.hospital.Patient;

public class HospitalTester {
	
	public static void main(String[] args, Object String) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the patient name");
		String patientName = sc.next();
		System.out.println("enter the adress");
		String adress= sc.next();
		
		Patient patient = new Patient(patientName,adress,String gender.male);
		
		
		
         Hosptial hospital = new Hosptial() ;
		hospital.isTreatmentRequired= true;
		hospital.isEmergency= true;
		hospital.admit(patient);
		
      sc.close();
	}



}
