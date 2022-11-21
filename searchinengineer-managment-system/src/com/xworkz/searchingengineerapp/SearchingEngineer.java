package com.xworkz.searchingengineerapp;

public class SearchingEngineer {
		
	public String name;
	public String information;
	
	
	public String toSearch(String information)
	{
		
		this.information=this.information+information;
		System.out.println(information);
		return information;
		
	}
		public String websiteName(String name)
		{
			this.name+=this.name;
			System.out.println("website name :"+name);
			return name;
			
		
		}
		
	}

		