package com.xworkz.abstractionapp.hospitalapp.interfaceapp;


public class Hospital1 {
	
public Patient patient;
	
	public boolean isTreatmentRequired;
	public boolean isEmergency;
	
	public boolean admit(Patient patient) {
		boolean isAdmit= false;
		
		if(isTreatmentRequired == true) {	
			if(isEmergency == true) {
			this.patient = patient;
			
			this.patient.displayInfo();
			System.out.println("patient can be allow");
			
		}
		else {
			System.out.println(" add patient to ganeral ward");
		}
			
	} 
		else {
		System.out.println("No tratment required");
		
	}
      return isAdmit;
}


}
