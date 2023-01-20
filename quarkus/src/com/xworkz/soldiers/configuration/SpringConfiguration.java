package com.xworkz.soldiers.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.xworkz.soldiers")
public class SpringConfiguration {
	
	public SpringConfiguration() {
		System.out.println("Creating Spring Configuration");
	}

	@Bean
	public Validator validator() {
		System.out.println("Registered in Spring Configuration");
		
		ValidatorFactory foctory = Validation.buildDefaultValidatorFactory();
		Validator validator = foctory.getValidator();
		return validator;
	}

}
