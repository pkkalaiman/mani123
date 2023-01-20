package com.xworkz.soldiers.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldiers.configuration.SpringConfiguration;
import com.xworkz.soldiers.dto.FirstAidDto;
import com.xworkz.soldiers.service.FirstAidDtoService;

public class FirstAidRunner {

	 public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		FirstAidDtoService service = container.getBean(FirstAidDtoService.class);
		
		boolean saved = service.ValidateSave(new FirstAidDto());
		System.out.println("Saved :" + saved);
		
	}

}
