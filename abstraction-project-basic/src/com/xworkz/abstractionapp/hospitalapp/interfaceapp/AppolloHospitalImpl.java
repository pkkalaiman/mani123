package com.xworkz.abstractionapp.hospitalapp.interfaceapp;

import com.xworkz.abstractionapp.abstraction.Patient;

public abstract class AppolloHospitalImpl implements Hospital {
	
public  Patient[] patients;
	
	Patient[] newPatients;
	
	int index;
	

	public void AppolloHospital(int size) 
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
		System.out.println("inside getPatientbyName");
		System.out.println("no of Patients : 2: patientName(Stsring)");
		
		for(int i=0;i<patients.length;i++)
		{
			
			if(patients[i].getName().equals(PatientName))
			{
				
				System.out.println(patients[i].getName()+" "+patients[i].getAge()+" "+patients[i].getAddress()+" "+patients[i].getGender());

				
			}else {
				System.out.println("No of patient name is added");
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
			
			//if(patients[i].getAge()==age) {
				
				
				System.out.println(patients[i].getName()+" "+patients[i].getAge()+" "+patients[i].getAddress()+" "+patients[i].getGender());
				
				
			}
		//else {
				System.out.println("It Dosen't Match");
			//}
		}
		
		
	//}
	
	//************************************************************************************************************************************************
	
	public void getPatientByGender(Gender gender) {
		System.out.println("inside getPatientage");
		System.out.println("no of Patients : 2: patientage(age)");
		
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
	 
	public boolean updateAddressByName(String name, String newPatientAddress) {
		
		boolean isUpdate =false;
		
		System.out.println("Inside Ubdate PatientAddressByName");
		System.out.println("No of Parameters : 2 :1) param patientName(String) 2) param patientAddress");
		
		for(int i=0; i < patients.length; i++) {
			
			if(patients[i].getName().equals(name)) {
				
				System.out.println("Patient name is macthed.. proce with ubdating the address");
				patients[i].setAddress(newPatientAddress);
				isUpdate =true;
				
			}
			
		}
		return isUpdate;	
	}
		
		public boolean deletePatientByName(String patientName) {
			
			boolean isDeleted =false;
			
			newPatients =new Patient[patients.length-1];
			
			for(int i=0, k=0; i< patients.length; i++) {
				
				if(!patients[i].getName().equals(patientName)) {
					
					newPatients[k++] =patients[i];
					
					isDeleted=true;
				}
				//System.out.println(patients.toString(newPatients));
				
			}
			
			
			return isDeleted;
			
		}
	
		
		public void getAllnewPatients() 
		{
			System.out.println("list of patientes are :");
			for(int i=0;i<patients.length;i++)
			{
				System.out.println(newPatients[i].getName()+" "+newPatients[i].getAge()+" "+newPatients[i].getAddress()+" "+newPatients[i].getGender());
			}
		}
		

}
