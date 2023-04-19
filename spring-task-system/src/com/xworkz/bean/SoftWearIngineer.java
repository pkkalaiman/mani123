package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftWearIngineer {

	@Autowired
	@Qualifier("EngineerName")
	private String name;

	@Autowired
	@Qualifier("EmployeSalary")
	private double price;

	@Autowired
	@Qualifier("DevExpierence")
	private int experience;

	/*
	 * @Autowired
	 * 
	 * @Qualifier("wichDevolopper") private String wichDevolopper;
	 */

	public SoftWearIngineer(String name, double price, int experience, String wichDevolopper) {
		super();
		this.name = name;
		this.price = price;
		this.experience = experience;
		//this.wichDevolopper = wichDevolopper;

	}

	@Override
	public String toString() {
		return "SoftWearIngineer [name=" + name + ", price=" + price + "experience" + "wichDevolopper"+ "]";
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getExperience() {
		return 12;
	}

	/*
	 * public String getWichDevolopper() { return wichDevolopper; }
	 */

}
