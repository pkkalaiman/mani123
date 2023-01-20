package com.xworkz.taskapp.boot;

import java.util.Arrays; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.taskapp.bean.Airport;
import com.xworkz.taskapp.bean.Malls;
import com.xworkz.taskapp.bean.SoftWear;
import com.xworkz.taskapp.configuration.AirportConfiguration;

public class AirportRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(AirportConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Airport refOfAir = container.getBean(Airport.class);
		System.out.println(refOfAir);
		
		System.out.println(refOfAir.getName());
		System.out.println(refOfAir.getId());
		System.out.println(refOfAir.getNoOfFlight());
		System.out.println(refOfAir.getPrice());

		SoftWear refOfSoft = container.getBean(SoftWear.class);
		System.out.println(refOfSoft);
		System.out.println(refOfSoft.getName());
		System.out.println(refOfSoft.getDevelopper());
		System.out.println(refOfSoft.getFree());
		System.out.println(refOfSoft.getVersion());
		
		
		Malls ma=container.getBean(Malls.class);
		
		System.out.println(ma);
		
		System.out.println(ma.getName());
		System.out.println(ma.getNoOfMalls());
		System.out.println(ma.getPlace());
		
		
	
	}

}
