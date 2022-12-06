package com.xworkz.hospitalapp.AppolloHospital;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.hospital.Gender.Gender;
import com.xworkz.hospitalapp.hospital.patient.Patient;

public class AppolloHospital extends Hospital {
	
	public  Patient[] patients;
	int index;
	

	public AppolloHospital(int size) 
	{
		patients=new Patient[size];
		
	}
	
	public boolean addPatient(Patient patient)
	{
		System.out.println("inside addPatient method");
		
		boolean isPatientAdded=false;
		
		if(patient!=null) 
		{
			System.out.println("patient detiales are added");
			patients[index++]=patient;
			isPatientAdded =true;
		}
			System.out.println("end addpatient method");
			return isPatientAdded;
	    }
	
	public void getAllPatients() 
	{
		System.out.println("list of patientes are");
		for(int i=0;i<patients.length;i++)
		{
			System.out.println(patients[i].getName()+" "+patients[i].getAge()+" "+patients[i].getAddress()+" "+patients[i].getGender());
		}
	}
	
	//**********************************************************************************************************************************************************************************
	public void getPatientByName(String PatientName)
	{
		System.out.println("inside getPatientName");
		System.out.println("no of Patients : 1: patientName(Stsring)");
		
		for(int i=0;i<patients.length;i++)
		{
			
			if(patients[i].getName().equals(PatientName))
			{
				
				System.out.println(patients[i].getName()+" "+patients[i].getAge()+" "+patients[i].getAddress()+" "+patients[i].getGender());

				
			}else {
				System.out.println("No Patient Found");
			}
		}
		
	}
	
	//*****************************************************************************************************************************************************************************************************
	
	
	
	
	
	
	//getPatientbyAge(int age)
	//getPatientByGender(Gender gender)
	//getPatientbyAddress(String address)
	//getPatientNameByGender(Gender)
	//getGenderBygenderName(String)
	
	public void getPatientbyAge(int age) {
		System.out.println("inside getPatientage");
		System.out.println("no of Patients : 1: patientage(age)");
		
		
		for(int i=0;i<patients.length;i++) {
			
			if(patients[i].getAge()==age) {
				
				
				System.out.println(patients[i].getName()+" "+patients[i].getAge()+" "+patients[i].getAddress()+" "+patients[i].getGender());
				
				
			}else {
				System.out.println("It Dose Not Match");
			}
		}
		
		
	}
	
	//************************************************************************************************************************************************
	
	public void getPatientByGender(Gender gender) {
		System.out.println("inside getPatientage");
		System.out.println("no of Patients : 1: patientage(age)");
		
		for(int i=0;i<patients.length;i++) {
			
			if(patients[i].getGender().equals(gender)) {
				System.out.println(patients[i].getName()+" "+patients[i].getAge()+" "+patients[i].getAddress()+" "+patients[i].getGender());

			}else {
				System.out.println("Gender not found");
			}
			
		}
		
	}
	
//**********************************************************************************************************************************************	
	
	public void getPatientbyAddress(String address) {
		
		for(int i=0;i<patients.length;i++) {
			
			if(patients[i].getAddress().equals(address)) {
				System.out.println(patients[i].getName()+" "+patients[i].getAge()+" "+patients[i].getAddress()+" "+patients[i].getGender());

			}else {
				System.out.println("Address not Found");
			}
			
		}
	}
	
//**************************************************************************************************************************************************
	 public void getPatientNameByGender(Gender gender) {
		 
		 for(int i=0;i<patients.length;i++) {
			 
			 if(patients[i].getGender().equals(gender)) {
				
				 System.out.println(patients[i].getName());
				 
				 
			 }else {
				 System.out.println("Nmae not found");
			 }
		 }
	 }
	 
//***************************************************************************************************************************************	
	
	 public void getGenderBygenderName(String name) {
		 
 for(int i=0;i<patients.length;i++) {
			 
			 if(patients[i].getName().equals(name)) {
				
				 System.out.println(patients[i].getGender());
				 
				 
			 }else {
				 System.out.println("Gender not found");
			 }
		 } 
	 }
	 
//******************************************************************************************************************************************	

}
