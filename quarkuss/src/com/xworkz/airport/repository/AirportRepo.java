package com.xworkz.airport.repository;

import com.xworkz.airport.dto.AirportDto;

public interface AirportRepo {
	
	boolean ValidateAndSave(AirportDto dto);

}
