package com.xworkz.hospitalapps;

public class Hospital{
	
	//String patientNames[] = {null , null , null , null , null };
	  // Datatype variableName[]  = {value}; 

	  // Datatype variableNames[] = new Datatype[size] ; 
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
			
	} else {
		System.out.println("No tratment required");
		
	}
      return isAdmit;
}
}
}
	
	
	

