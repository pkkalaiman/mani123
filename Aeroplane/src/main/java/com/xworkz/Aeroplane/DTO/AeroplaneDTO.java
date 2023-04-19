package com.xworkz.Aeroplane.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AeroplaneDTO {

	
	
	@Size(min=2, max=30, message="companyName will be Lesser then 2, Greater then 30")
	private String companyName;
	
	@Size(min=3, max=20, message="Name will be Lesser then 3, Greater then 20,")
	private String name;
	
	@NotNull(message="Minimum Cost 2000")
	private int cost;
	
	@NotBlank(message="Please Select the Type..")
	private String type;
	
	@NotBlank(message="Please Select Country...")
	private String country;
	
	
	
}
