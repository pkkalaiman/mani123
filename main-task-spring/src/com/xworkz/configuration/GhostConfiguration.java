package com.xworkz.configuration;

import java.time.LocalDate; 

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.been")
public class GhostConfiguration {
	
	
	public GhostConfiguration() {
		System.out.println("Created GhostConfiguration");
	}
	
	@Bean
	public String GhostName() {
		System.out.println("Registered In GhostName in  Spring");
		return "Mani";
	}
	@Bean
	public String GhostGender() {
		System.out.println("Registered In GhostGender Spring");
		return "Female";
	}
	@Bean
	public double NailLength() {
		System.out.println("Registered NailLength Spring");
		return 2.2;
	}
	@Bean
	public LocalDate dateOfDeath() {
		System.out.println("Registered in DateOfDeath Spring");
		return LocalDateOf(2012,5.6);
	}
	private LocalDate LocalDateOf(int i, double d) {
		
		return null;
	}

}
