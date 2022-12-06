package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.hospital.patient.Patient;

public class Hospital {
	
		
	public Patient patient;
	
	public boolean isEmergency=true;
	public boolean isTreatmentRequired=true;
	
	public boolean admit(Patient patient) {
		
		boolean isAdmitted=false;
		
		if(isTreatmentRequired==true) {
			if(isEmergency ==true) {
				this.patient=patient;
				patient.displayInfo();
				System.out.println("Patient can be allowed in original in general ward");
				
				
			}
		}else {
			System.out.println("Treatment is n ot required......");
		}
		return isAdmitted;
	}

}
