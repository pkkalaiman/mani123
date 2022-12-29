package com.xworkz.dtoapp.CollectionDtoApp;


public class SanitizerDto {
	
	private int id;
	private String name;
	private double price;
	private String color;
	private String brand;
	
	
	
	public SanitizerDto(int id, String name, double price, String color, String brand) {
		this.id = id;
		this.name = name;
		this.price=price;
		this.color=color;
		this.brand=brand;
		
	}


	@Override
	public String toString() {
		return "id : "+ id + "  "+ 
	           "name :"+name + " "  +
			   "price  :"  + price +
	           "Color :" +  color + "  "+ 
			   "Brand Name :" + " " + brand;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	@Override
	public boolean equals(Object reference) {
		System.out.println("Running Equals From SanitizerDto");

		if(reference !=null) {
			
			if(reference instanceof SanitizerDto) {
				
				SanitizerDto dto=(SanitizerDto) reference;
				
				if(dto.name.equals(this.name)) {
					System.out.println(dto.name);
				}
			}
			
		}
		return true;
	}
	
	
	
	
	
	
	
}
