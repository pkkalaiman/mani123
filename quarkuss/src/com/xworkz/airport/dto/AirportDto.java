package com.xworkz.airport.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AirportDto extends AbstractAuditDto {
	
	@NotNull
	@NotBlank
	@Size(min=2, max=20, message="created name in size graterthen 20")
	private String airportName;
	
	@Min(2)
	@Max(20000)
	private int noOfAirport;
	
	@NotNull
	@NotBlank
	@Size(min=4, max=30)
	private String employeName;
	
	@Min(10000)
	@Max(200000)
	private double empSalary;
	
	@NotNull
	@NotBlank
	@Size(min=5, max=30)
	private String country;
	
	
	

}
