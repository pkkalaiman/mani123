package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftWearIngineer {

	@Autowired
	@Qualifier("SoftWearIngineer")
	private String name;
	@Autowired
	@Qualifier("2525.25")
	private double price;
	
	
	@Autowired
	public SoftWearIngineer(@Qualifier("name")String name, @Qualifier("2525.25")double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "SoftWearIngineer [name=" + name + ", price=" + price + ", getName()=" + getName() + ", getPrice()="
				+ getPrice() + "]";
	}



	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	

}
