package com.xworkz.soldiers.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldiers.configuration.SpringConfiguration;
import com.xworkz.soldiers.dto.RessortDto;
import com.xworkz.soldiers.service.RessortService;

public class RessortRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		RessortService service = context.getBean(RessortService.class);

		RessortDto ref = new RessortDto();
		service.ValidateAndSave(ref);
	}

}
