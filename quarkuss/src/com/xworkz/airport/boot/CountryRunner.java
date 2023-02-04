package com.xworkz.airport.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.airport.configuration.AirportConfiguration;
import com.xworkz.airport.dto.CountryDto;
import com.xworkz.airport.service.CountryService;

public class CountryRunner {

	public static void main(String[] args) {
		
		CountryDto dto=new CountryDto("Dharmapuri", -29);
		 
		
		ApplicationContext container=new AnnotationConfigApplicationContext(AirportConfiguration.class);
		CountryService service=container.getBean(CountryService.class);
		
	    boolean saved=	service.ValidateAndSave(new CountryDto());
	    
	    System.out.println("Saved :"+dto);

	}

}
