package com.xworkz.theatrs.Theatrsapp;

public class Theatrs {

	public String name;
	public int id;
	public String address;
	public String location;
	
	public Theatrs(String name, int id, String address, String location) {
		
		this.name=name;
		this.id=id;
		this.address=address;
		this.location=location;
	}
	
	@Override
	public String toString() {
		
		return "Theatres[name :"+name+" "+"id :"+id+" "+"address :"+" "+address+" "+"location :"+location+"]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
}
