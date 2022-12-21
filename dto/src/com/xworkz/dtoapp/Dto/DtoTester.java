package com.xworkz.dtoapp.Dto;


public class DtoTester extends Dto {
	
	public static void main(String[] args) {
		
		Dto dto = new Dto();
		dto.setName("P K Mani");
		dto.setId(878345678);
		dto.setModelNumber("Core i3");
		dto.setAsin("2152");
		dto.setCountryOfOrigin("Indian");
		dto.setManifacturing("Windows 11");
		dto.setPrice(12.9999);
		dto.setWeight("12.89 kg");
		
		
		System.out.println(dto.getName());
		System.out.println(dto.getId());
		System.out.println(dto.getModelNumber());
		System.out.println(dto.getAsin());
		System.out.println(dto.getCountryOfOrigin());
		System.out.println(dto.getManifacturing());
		System.out.println(dto.getPrice());
		System.out.println(dto.getWeight());
				
		
	
		
		
		
	}

}
