package com.xworkz.taskapp.configuration;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz.taskapp.bean")
//@ComponentScan(basePackages = "com.xworkz.taskapp.bean", excludeFilters = {
//		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, 
//				value = {AirportConfiguration.class, SoftWear.class})})
public class AirportConfiguration {

	public AirportConfiguration() {
		System.out.println("Created in AirportConfiguration to Spring......");
	}

	@Bean
	public String name() {
		System.out.println("Name is Registered with Spring");
		return "NAME : Mani P K";
	}

	@Bean
	public int id() {
		System.out.println("Regestered in ID with Spring");
		return 33;
	}

	@Bean
	public double price() {
		System.out.println("Registered in Price to Spring.....");
		return 876.3;
	}

	@Bean
	public int noOfFlight() {
		System.out.println("Registered to the NoOfFlight to Spring..........");
		return 878;
	}

	// ***************************************************************************
	@Bean
	public String Devloppername() {
		System.out.println("Softwear Registered in Spring class");
		return "Santhosh";
	}

	@Bean
	public double Sofwearversion() {
		System.out.println("Verion created to Spring ");
		return 657.9;
	}

	@Bean
	public String Softweardevelopper() {
		System.out.println("Devlopper Name created in Spring....");
		return "Dhinesh";
	}

	@Bean
	public String Devlopperfree() {
		System.out.println("Developper Free to the Spring");
		return "WednesDay";

	}

}
