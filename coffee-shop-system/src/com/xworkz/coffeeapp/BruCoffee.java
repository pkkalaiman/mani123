package com.xworkz.coffeeapp;

public class BruCoffee {
	
	private String brandName;
	private String coustomerName;
	private String price;
	private String companyName;
	
	
	
	public BruCoffee(String brandName, String coustomerName, String price, String companyName) {
		
		System.out.println("BruCoffee object is created");
		
		this.brandName = brandName;
		this.coustomerName = coustomerName;
		this.price = price;
		this.companyName = companyName;
		
		
	}
	
	public BruCoffee(String string, String string2, double d) {
		// TODO Auto-generated constructor stub
	}

	public void displyDetials() {
		
		System.out.println("restourent Name:"+this.brandName);
		System.out.println("coustomer Name:"+this.coustomerName);
		System.out.println("price:"+this.price);
		System.out.println("companyName:"+this.companyName);
		System.out.println("List of coffee brandName");
		
    for(int i=0;i<coustomerName.length();i++) {
			
			System.out.println(coustomerName);
    }
    
	}
	

}
