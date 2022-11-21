package com.xworkz.hospitalapp.hospital;

public class Hosptial {
	
public Patient patient;
	
	public boolean isTreatmentRequired;
	public boolean isEmergency;
	
	public boolean admit(Patient patient) {
		boolean isAdmit= false;
		
		if(isTreatmentRequired == true) {	
			if(isEmergency == true) {
			this.patient = patient;
			
			this.petient.displayInfo();
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
