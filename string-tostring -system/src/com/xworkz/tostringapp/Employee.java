package com.xworkz.tostringapp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@ToString
public class Employee {
	
	
	public Employee() {
		System.out.println(this.getClass().getSimpleName()+"object is created");
	}

	private int id;
	private String name;

	@Override
	// equality contract = equals and HasCode
	public boolean equals(Object obj) {
		//this is called as DownCasting
		Employee enp =  (Employee) obj;
		if(this.getName().equals(enp.getName())) {
			return true ;	
		}
		return false;
	}
	
	@Override
	 // Hascode meanse unic number then compire in ID
	public int hashCode() {
		
		return this.id;
	}
	 
	//  TOSTRING meanse print the String referesentativ in ibject
	  @Override 
	  public String toString() { return "Employee - {Id = "+this.getId()+ ", Name = "+this.getName()+"}";
	  
	  }	
	

}
