package com.xworkz.dtoapp.Dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Dto {
	
	public Dto() {
		System.out.println(this.getClass().getSimpleName() + "Class Object is Created");
	}
	
	private String name;
	private int id;
	private String modelNumber;
	private String asin;
	private String countryOfOrigin;
	private String manifacturing;
	private String weight;
	private double price;
	
	/*
	 * @Override public boolean equals(Object obj) {
	 * 
	 * Dto dt=(Dto) obj;
	 * 
	 * if(this.getId().)
	 * 
	 * return true;
	 * 
	 * }
	 */
	
	
	//public String toString() {
	
	}


