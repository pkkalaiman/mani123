package com.xworkz.airport.repository;

import com.xworkz.airport.dto.AirportDto;

public class AirportRepoImple implements AirportRepo {

	public AirportRepoImple() {
		System.out.println("Registered to AirportRepoImple");
	}
	
	@Override
	public boolean ValidateAndSave(AirportDto dto) {
		System.out.println("Registeered in ValidateAndSave");
		System.out.println("AiportDto :"+dto);
		return false;
	}

}
