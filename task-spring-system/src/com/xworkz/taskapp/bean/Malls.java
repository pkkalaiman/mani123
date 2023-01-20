package com.xworkz.taskapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Malls {

	private String name;
	private String place;
	private int noOfMalls;


	@Autowired
	public Malls(@Qualifier("MallName") String name, @Qualifier("PlaceofMall") String place,
			@Qualifier("noOfMalls") int noOfMalls) {
		super();
		this.name = name;
		this.place = place;
		this.noOfMalls = noOfMalls;
	}

	@Override
	public String toString() {
		return "Malls [name=" + name + ", place=" + place + ", noOfMalls=" + noOfMalls + "]";
	}

	public String getName() {
		return name;
	}

	public int getNoOfMalls() {
		return noOfMalls;
	}

	public String getPlace() {
		return place;
	}

}
