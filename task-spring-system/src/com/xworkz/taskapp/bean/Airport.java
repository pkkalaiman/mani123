package com.xworkz.taskapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Airport {

	private String name;
	private int id;
	private double price;
	private int noOfFlight;

	public Airport() {
		System.out.println("Created Airport no argument Spring");
	}

	@Autowired
	public Airport(String name,@Qualifier("id") int id,@Qualifier("price") double price, @Qualifier("noOfFlight") int noOfFlight) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		this.noOfFlight = noOfFlight;
	}

	@Override
	public String toString() {
		return "Airport [name=" + name + ", id=" + id + ", price=" + price + ", noOfFlight=" + noOfFlight + "]";
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getNoOfFlight() {
		return noOfFlight;
	}
	
	public double getPrice() {
		return price;
	}
	
	

}
