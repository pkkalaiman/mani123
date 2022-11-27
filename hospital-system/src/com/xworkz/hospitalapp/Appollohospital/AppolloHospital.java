package com.xworkz.hospitalapp.Appollohospital;

import com.xworkz.hospitalapp.hospital.Hospital1;
import com.xworkz.hospitalapp.petient.Patient;

public class AppolloHospital<patient> extends Hospital1 {
	
	// one to many
	
		public Patient[] patients;
		int index;
		
		public AppolloHospital()
		{
			
		}
		public AppolloHospital(int size)
		 
		{
			patients = new Patient[size];
		}
		
		public boolean addPatients(Patient patient)
		{
			System.out.println("inside addpatient method");
			boolean isPatientAdded = false;
			if(patient !=null)
			{
				System.out.println("patient details are registered successfully..");
				patients[index] = patient;
				isPatientAdded = true;
				index++;
			}
			
			System.out.println("end addpatient method");
			return isPatientAdded;
			
		}
		
		public void getAllPAtients()
		{
			System.out.println("List the patients are ");
			for (int i = 0; i < patients.length; i++) {
				
				System.out.println(patients[i].patientName + " " +patients[i].age + " " +patients[i].adress + " "  +patients[i].gender);
				
			}
		}

	}


