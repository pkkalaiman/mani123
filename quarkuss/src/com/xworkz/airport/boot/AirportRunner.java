package com.xworkz.airport.boot;

import com.xworkz.airport.dto.AirportDto;
import com.xworkz.airport.repository.AirportRepoImple;
import com.xworkz.airport.service.AirportServiceImple;

public class AirportRunner {

	public static void main(String[] args) {

		AirportDto dto = new AirportDto("Chennai Airport", 1345, "Mani", 29888.98, "India");

		AirportServiceImple service = new AirportServiceImple();
		AirportRepoImple repo = new AirportRepoImple();

		service.setAirport(repo);

		service.ValidateAndSave(dto);

	}

}
