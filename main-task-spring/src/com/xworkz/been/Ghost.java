package com.xworkz.been;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	
	@Autowired
	@Qualifier("GhostName")
	private String name;
	@Autowired
	@Qualifier("GhostGender")
	private String gender;
	@Autowired
	private double nailLength;
	@Autowired
	
	private LocalDate dateOfDeath;

	public Ghost(String name,String gender,double nailLength,LocalDate dateOfDeath) {
		
		super();
		this.name=name;
		this.gender=gender;
		this.nailLength=nailLength;
		this.dateOfDeath=dateOfDeath;
		
	}

	@Override
	public String toString() {
		return "Name :"+name+" "+"gender :"+gender+" "+"nailLength :"+nailLength+" "+ "dateOfDeath :"+dateOfDeath;
		
	}

}
