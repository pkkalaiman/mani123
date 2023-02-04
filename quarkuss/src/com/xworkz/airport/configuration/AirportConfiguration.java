package com.xworkz.airport.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.xworkz.airport")
public class AirportConfiguration {

	public AirportConfiguration() {
		System.out.println("Created in AirportConfiguration");
	}

	@Bean
	public Validator validator() {
		System.out.println("Created in Validator SpringConfiguration");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		return validator;

	}

}
