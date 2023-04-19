package com.xworkz.airport.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.airport.dto.AirportDto;
import com.xworkz.airport.repository.AirportRepoImple;

public class AirportServiceImple implements AirportService {
	
	public AirportRepoImple airport;
	
	public void setAirport(AirportRepoImple airport) {
		this.airport = airport;
	}

	public AirportServiceImple() {
		System.out.println("Registered By AirportServiceImple");
	}

	@Override
	public boolean ValidateAndSave(AirportDto dto) {
		System.out.println("Created in ValidateAndSave");
		System.out.println("AirportDto" + dto);

		ValidatorFactory foctary = Validation.buildDefaultValidatorFactory();
		Validator validator = foctary.getValidator();
		Set<ConstraintViolation<AirportDto>> violation = validator.validate(dto);

		if (!violation.isEmpty()) {
			System.out.println("there are Validator Error");
			
			violation.forEach(v -> {
				System.out.println("Validator Error :" + v.getMessage());
			});
			return false;
		}else {
			System.out.println("Data is Valid");
			boolean saved=airport.ValidateAndSave(dto);
			System.out.println("Dto Saved :"+saved);
			
			return true;
		}
	}

}
