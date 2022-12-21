package com.xworkz.abstractionapp.hospitalapp.interfaceapp;

import com.xworkz.abstractionapp.abstraction.Patient;

public interface Hospital {
	
	public boolean addPatient(Patient patient);
	
	public void getPatients();
	
	public void getPatientByName();
	
	public void getAllNewPatients();
	
	public boolean deleteByPtaientByName(String patientsname);
	
	public boolean ubdatePatientAddressByName(String address);
	
	
	

}
