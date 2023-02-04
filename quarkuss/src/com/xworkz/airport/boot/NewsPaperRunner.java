package com.xworkz.airport.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.airport.configuration.AirportConfiguration;
import com.xworkz.airport.dto.NewsPaperDto;
import com.xworkz.airport.service.NewsPaperService;

public class NewsPaperRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(AirportConfiguration.class);
		NewsPaperService service = container.getBean(NewsPaperService.class);

		NewsPaperDto news = new NewsPaperDto();
		service.ValidateAndSave(news);

		/*
		 * boolean saved= service.ValidateAndSave(new NewsPaperDto());
		 * System.out.println("Dto saved :"+saved);
		 */

	}

}
