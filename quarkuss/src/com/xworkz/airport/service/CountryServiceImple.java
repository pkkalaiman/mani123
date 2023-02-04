package com.xworkz.airport.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.airport.dto.CountryDto;
import com.xworkz.airport.repository.CountryRepoImple;

@Component
public class CountryServiceImple implements CountryService {

	@Autowired
	private Validator validator;
	
	private CountryRepoImple countryimpl;

	@Autowired
	 public void setCountryimpl(CountryRepoImple countryimpl) {
		this.countryimpl = countryimpl;
	}
	
	@Override
	public boolean ValidateAndSave(CountryDto dto) {
		System.out.println("Created in Spring ValidateAndSave");
		System.out.println("Dto :"+ dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<CountryDto>> voilation=validator.validate(dto);
		
		if(!voilation.isEmpty()) {
			System.out.println("there are Validator Error");
			
			voilation.forEach(m->{System.out.println("Validator Eroe :"+m.getMessage());
			});
			return false;
			
		}else {
			System.out.println("Validator Is Valid");
			boolean saved= countryimpl.Save(dto);
			System.out.println("Dto saved :"+dto);
		}
		return true;
	}

}
